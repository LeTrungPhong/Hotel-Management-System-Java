// variable
let headerWidth = 200;
let headerWidthBar = 50;

// body
var bodyContainer = document.querySelector('.container');

// header - account - dashboard - nav - item
var header = document.querySelector('.header');
var headerAccount = document.querySelector('.header__dashboard-account');
var headerAccountNav = document.querySelector('.header__dashboard-account-nav');
var headerAccountNavItem = document.getElementsByClassName('header__dashboard-account-nav-item');
var headerAccountNavImg = document.querySelector('.header__dashboard-account-nav-img');

headerAccount.addEventListener('click',() => {
    let heightheaderitems = 50;
    if(headerAccountNav.classList.contains("dp-n")){
        headerAccountNav.classList.remove('dp-n');
        setTimeout(() => {
            for(let i = 0; i < headerAccountNavItem.length; ++i){
                headerAccountNavItem[i].style.transform = `translate(0px, ${heightheaderitems*(i+1)}px`;
                headerAccountNavItem[i].style.opacity = 1;
                headerAccountNavImg.style.transform = 'rotate(180deg)';
            }
        },0);
    }
    else
    {
        setTimeout(() => {
            for(let i = 0; i < headerAccountNavItem.length; ++i){
                headerAccountNavItem[i].style.transform = 'translate(0px, 20px)';
                headerAccountNavItem[i].style.opacity = 0;
                headerAccountNavImg.style.transform = 'rotate(0deg)';
            }
        },0);
        setTimeout(() => {
            headerAccountNav.classList.add('dp-n');
        },1000);
    }
});

// header - dashboard - notification - icon
var headerDashboardNotification = document.querySelector('.header__dashboard-notification');
var headerDashboardNotificationIcon = document.querySelector('.header__dashboard-notification-icon');

if(1){
    setInterval(() => {    
        setTimeout(() => {
            headerDashboardNotificationIcon.style.transform = `rotate(100deg)`;
        },500);
        headerDashboardNotificationIcon.style.transform = `rotate(-100deg)`;
    },1000);    
}
// nav
var nav = document.querySelector('.nav');
var navBar = document.querySelector('.nav__bar');
var navBarImg = document.querySelector('.nav__bar-img');
var navList = document.querySelector('.nav__list');
var navListItem = document.getElementsByClassName('nav__list-item');
var navListItemText = document.getElementsByClassName('nav__list-item-text');
var navListItemImg = document.getElementsByClassName('nav__list-item-img');
let maxnavListItem = 0;

document.addEventListener('DOMContentLoaded',() => {
    nav.style.width = `${headerWidth}px`;
    bodyContainer.style.gridTemplateColumns = `${headerWidth}px 1fr`;
    header.style.width = `calc(100% - ${nav.clientWidth}px)`;   
    for(let i = 0; i < navListItem.length; ++i){
        let temp = navListItemText[i].clientWidth + navListItemImg[i].clientWidth;
        if(temp > maxnavListItem) maxnavListItem = temp;
    }
    for(let i = 0; i < navListItem.length; ++i){
        navListItem[i].style.paddingLeft = `${(navList.clientWidth - maxnavListItem)/3}px`;
        // navListItemText[i].style.opacity = 1;
    }
});

function navUnHidden() {
    nav.classList.remove('check');
    nav.style.width = `${headerWidth}px`;
    bodyContainer.style.gridTemplateColumns = `${headerWidth}px 1fr`;
    header.style.width = `calc(100% - ${headerWidth}px)`;
    navBarImg.style.transform = 'rotate(0deg)';
    setTimeout(() => {
        for(let i = 0; i < navListItemText.length; ++i){
            navListItemText[i].classList.remove('dp-n');
        }
    },500);
    for(let i = 0; i < navListItem.length; ++i){
        navListItem[i].style.justifyContent = "start";
        navListItemText[i].style.opacity = 1;
    }
    for(let i = 0; i < navListItem.length; ++i){
        navListItem[i].style.paddingLeft = `${(headerWidth - maxnavListItem)/3}px`;
    }
    nav.style.cursor = "auto";
}

function navHidden() {
    nav.classList.add('check');
    nav.style.width = `${headerWidthBar}px`; 
    bodyContainer.style.gridTemplateColumns = `${headerWidthBar}px 1fr`;
    header.style.width = `calc(100% - ${headerWidthBar}px)`;
    navBarImg.style.transform = 'rotate(180deg)';
    setTimeout(() => {
        for(let i = 0; i < navListItemText.length; ++i){
            navListItemText[i].classList.add('dp-n');
        }
    },200);
    for(let i = 0; i < navListItem.length; ++i){
        navListItem[i].style.paddingLeft = "15px";
        navListItemText[i].style.opacity = 0;
    }
    setTimeout(() => {
        for(let i = 0; i < navListItem.length; ++i){
            navListItem[i].style.justifyContent = "center";
        } 
    },500);
    nav.style.cursor = "pointer";
}

navBar.addEventListener('click',() => {
    if(nav.classList.contains('check')){
        navUnHidden();
    }
    else
    {
        navHidden();
    }
});

nav.addEventListener('click',(event) => {
    if(!event.target.classList.contains('nav__bar') && !event.target.classList.contains('nav__bar-img')){
        if(nav.classList.contains('check')){
            navUnHidden();
        }
    }
});

for(let i = 0; i < navListItem.length; ++i){
    navListItem[i].addEventListener('click',() => {
        navListItemText[i].click();
    });
}

// content
var contentListRoom = document.querySelector('.content__listroom');
var contentListRoomItem = document.getElementsByClassName('content__listroom-item');
var contentListRoomItemForm = document.getElementsByClassName('content__listroom-item-form');
var contentListRoomItemCheck = document.getElementsByClassName('content__listroom-item-check');

document.addEventListener('DOMContentLoaded',() => {
    for(let i = 0; i < contentListRoomItemForm.length; ++i){
        contentListRoomItemCheck[i].style.transform = "skewx(-20deg)";

        setTimeout(() => {
            contentListRoomItemCheck[i].style.transform = "skewx(-30deg)";
        },250)
    }
})

for(let i = 0; i < contentListRoomItemCheck.length; ++i){
    contentListRoomItemCheck[i].style.height = '50px';
}

for(let i = 0; i < contentListRoomItemCheck.length; ++i){
    if(i%3 == 0){
        contentListRoomItemCheck[i].classList.add('background-color-check-g');
        contentListRoomItemCheck[i].classList.remove('background-color-check-r');
    }
    else
    {
        contentListRoomItemCheck[i].classList.remove('background-color-check-g');
        contentListRoomItemCheck[i].classList.add('background-color-check-r');
    }
}

for(let i = 0; i < contentListRoomItemForm.length; ++i){
    contentListRoomItemForm[i].addEventListener('mouseover',() => {
        contentListRoomItemForm[i].style.boxShadow = "4px 0px 6px 1px gray";
        contentListRoomItemCheck[i].style.transform = "skewx(-20deg)";
    })
}

for(let i = 0; i < contentListRoomItemForm.length; ++i){
    contentListRoomItemForm[i].addEventListener('mouseleave',() => {
        contentListRoomItemForm[i].style.boxShadow = "3px 0px 6px 0px gray";
        contentListRoomItemCheck[i].style.transform = "skewx(-30deg)";
    })
}

// sign
var sign = document.querySelector('.sign');
var signAccount = document.querySelector('.sign-account');
var signAccountIn = document.querySelector('.sign-account-in');
var signAccountUp = document.querySelector('.sign-account-up');
var signMove = document.querySelector('.sign-move');
var signMoveIn = document.querySelector('.sign-move-in');
var signMoveUp = document.querySelector('.sign-move-up');
var signMoveUpButton = document.querySelector('.sign-move-up__button');
var signMoveInButton = document.querySelector('.sign-move-in__button');


signMoveUpButton.addEventListener('click',() => {
    signMove.style.transform = "translatex(-100%)";
    signAccount.style.transform = "translatex(100%)";
    signAccountIn.style.opacity = 0;
    signMoveUp.style.opacity = 0;
    setTimeout(() => {
        signAccountIn.style.display = 'none';
        signMoveUp.style.display = 'none';
    },250);

    signAccountUp.style.display = 'flex';
    signMoveIn.style.display = 'flex';
    setTimeout(() => {
        signAccountUp.style.opacity = 1;
        signMoveIn.style.opacity = 1;
    },0);
});

signMoveInButton.addEventListener('click',() => {
    signMove.style.transform = "translatex(0%)";
    signAccount.style.transform = "translatex(0%)";
    signAccountUp.style.opacity = 0;
    signMoveIn.style.opacity = 0;
    setTimeout(() => {
        signAccountUp.style.display = 'none';
        signMoveIn.style.display = 'none';
    },250);

    signAccountIn.style.display = 'flex';
    signMoveUp.style.display = 'flex';
    setTimeout(() => {
        signAccountIn.style.opacity = 1;
        signMoveUp.style.opacity = 1;
    },0);
});

var signTimes = document.querySelector('.sign-times');
var backgroundSign = document.querySelector('.background-sign');

signTimes.addEventListener('click',() => {
    signTimes.style.transform = `translatey(${sign.clientHeight}px)`;
    if(1){
        sign.classList.remove('box-shadow-sign');
        sign.classList.remove('background-color-sign');
        signAccount.style.transform = 'translatex(-100%)';
        signMove.style.transform = 'translatex(100%)';
        signAccount.style.opacity = 0;
        signMove.style.opacity = 0;
        setTimeout(() => {
            sign.style.display = 'none';
        },250);
        backgroundSign.style.opacity = 0;
        setTimeout(() => {
            backgroundSign.style.display = 'none';
        },250);
    }
});

var headerDashboardAccountNavItem = document.getElementsByClassName('header__dashboard-account-nav-item');

document.addEventListener('DOMContentLoaded',() => {
    sign.style.display = 'none';
    backgroundSign.style.display = 'none';
})

for(let i = 0; i < headerDashboardAccountNavItem.length; ++i){
    if(i == 0){
        headerDashboardAccountNavItem[i].addEventListener('click',() => {
            backgroundSign.style.display = 'block';
            setTimeout(() => {
                backgroundSign.style.opacity = 1;
            },0)
            sign.style.display = 'flex';
            setTimeout(() => {
                sign.classList.add('background-color-sign');
                sign.style.opacity = 1;
            },250);
            signAccountIn.style.display = 'flex';
            signAccountIn.style.opacity = 1;
            signAccount.style.transform ='translatex(0px)';
            signAccount.style.opacity = 1;
            signAccountUp.style.display = 'none';
            signAccountUp.style.opacity = 0;
            signMoveUp.style.display = 'flex';
            signMoveUp.style.opacity = 1;
            signMove.style.transform = 'translatex(0px)';
            signMove.style.opacity = 1;
            signMoveIn.style.display = 'none';
            signMoveIn.style.opacity = 0;
            signTimes.style.transform = 'translate(0px, -40px)';
            sign.classList.add('box-shadow-sign');
        });
    }
    else
    {
        headerDashboardAccountNavItem[i].addEventListener('click',() => {
            backgroundSign.style.display = 'block';
            setTimeout(() => {
                backgroundSign.style.opacity = 1;
            },0)
            sign.style.display = 'flex';
            setTimeout(() => {
                sign.classList.add('background-color-sign');
                sign.style.opacity = 1;
            },250);
            signTimes.style.transform = 'translate(0px, -40px)';
            signAccountUp.style.display = 'flex';
            signAccountUp.style.opacity = 1;
            signAccount.style.transform ='translatex(100%)';
            signAccount.style.opacity = 1;
            signAccountIn.style.display = 'none';
            signAccountIn.style.opacity = 0;
            signMoveIn.style.display = 'flex';
            signMoveIn.style.opacity = 1;
            signMove.style.transform = 'translatex(-100%)';
            signMove.style.opacity = 1;
            signMoveUp.style.display = 'none';
            signMoveUp.style.opacity = 0;
            sign.classList.add('box-shadow-sign');
        });
    }
}