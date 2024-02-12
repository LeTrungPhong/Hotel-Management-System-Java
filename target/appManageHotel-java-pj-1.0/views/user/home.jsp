<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="http://localhost:8080/appManageHotel-java-pj/views/user/assets/style.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"/>
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet"/>
<title>Trang chu</title>
</head>
    <body class="container">
        <section class="background-sign"></section>
        <section class="sign background-color-sign box-shadow-sign">
            <div class="sign-times"><i class="fas fa-cut sign-times__img"></i></div>
            <div class="sign-account">
                <div class="sign-account-in">
                    <h1 class="sign-account-in__title">Sign in</h1>
                    <div class="sign-account-in__network">
                        <i class="fab fa-facebook-f sign-account-in__network-item"></i>
                        <i class="fab fa-google-plus-g sign-account-in__network-item"></i>
                        <i class="fab fa-linkedin-in sign-account-in__network-item"></i>
                    </div>
                    <p class="sign-account-in__desc">or use your account</p>
                    <input type="text" class="sign-account-in__input" placeholder="Email">
                    <input type="text" class="sign-account-in__input" placeholder="Password">
                    <a href="#" class="sign-account-in__link-forget">Forgot your password ?</a>
                    <button class="sign-account-in__button">SIGN IN</button>
                </div>
                <div class="sign-account-up">
                    <h1 class="sign-account-up__title">Create Account</h1>
                    <div class="sign-account-up__network">
                        <i class="fab fa-facebook-f sign-account-up__network-item"></i>
                        <i class="fab fa-google-plus-g sign-account-up__network-item"></i>
                        <i class="fab fa-linkedin-in sign-account-up__network-item"></i>
                    </div>
                    <p class="sign-account-up__desc">or use your email for registration</p>
                    <input type="text" class="sign-account-up__input" placeholder="Name">
                    <input type="text" class="sign-account-up__input" placeholder="Email">
                    <input type="text" class="sign-account-up__input" placeholder="Password">
                    <button class="sign-account-up__button">SIGN UP</button>
                </div>
            </div>
            <div class="sign-move">
                <div class="sign-move-up">
                    <h1 class="sign-move-up__title">Hello, Friend!</h1>
                    <p class="sign-move-up__desc">Enter your personal details and start journey with us</p>
                    <button class="sign-move-up__button">SIGN UP</button>
                </div>
                <div class="sign-move-in">
                    <h1 class="sign-move-in__title">Welcome Back!</h1>
                    <p class="sign-move-in__desc">To keep connected with us please login with your personal info</p>
                    <button class="sign-move-in__button">SIGN IN</button>
                </div>
            </div>
        </section>
        <header class="header">
            <div class="header__dashboard-name">Manage Hotel</div>
            <div class="header__dashboard">
                <div class="header__dashboard-search">
                    <input
                        type="text"
                        class="header__dashboard-search__input"
                        placeholder="Search for anything..."
                    />
                </div>
                <div class="header__dashboard-notification">
                    <i
                        class="far fa-bell header__dashboard-notification-icon"
                    ></i>
                </div>
                <div class="header__dashboard-account">
                    <i class="far fa-user header__dashboard-account-avatar"></i>
                    <div class="header__dashboard-account-name">
                        <p class="header__dashboard-account-name-text">
                            Le Trung Phong
                        </p>
                    </div>
                    <div class="header__dashboard-account-job">
                        <p class="header__dashboard-account-job-text">
                            Sinh vien
                        </p>
                    </div>
                    <i
                        class="fas fa-chevron-down header__dashboard-account-nav-img"
                    ></i>

                    <div class="header__dashboard-account-nav dp-n">
                        <a href="#" class="header__dashboard-account-nav-item"
                            >Sign in</a
                        >
                        <a href="#" class="header__dashboard-account-nav-item"
                            >Sign up</a
                        >
                    </div>
                </div>
            </div>
        </header>
        <nav class="nav">
            <div class="nav__bar">
                <i class="fas fa-chevron-left nav__bar-img"></i>
            </div>
            <div></div>
            <div class="nav__list">
                <div class="nav__list-item">
                    <i class="fas fa-briefcase nav__list-item-img"></i>
                    <a href="" class="nav__list-item-text">Check in</a>
                </div>
                <div class="nav__list-item">
                    <i class="fas fa-briefcase nav__list-item-img"></i>
                    <a href="" class="nav__list-item-text">Book room</a>
                </div>
                <div class="nav__list-item">
                    <i class="fas fa-briefcase nav__list-item-img"></i>
                    <a href="" class="nav__list-item-text">Confirm</a>
                </div>
                <div class="nav__list-item">
                    <i class="fas fa-briefcase nav__list-item-img"></i>
                    <a href="" class="nav__list-item-text">Service</a>
                </div>
                <div class="nav__list-item">
                    <i class="fas fa-briefcase nav__list-item-img"></i>
                    <a href="" class="nav__list-item-text">Check out</a>
                </div>
                <div class="nav__list-item">
                    <i class="fas fa-briefcase nav__list-item-img"></i>
                    <a href="" class="nav__list-item-text">Manage</a>
                </div>
            </div>
        </nav>
        <article class="content">
            <div class=""></div>
            <div class="content__listroom">
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
                <div class="content__listroom-item">
                    <div class="content__listroom-item-form">
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">ID:</p>
                            <p class="content__listroom-item-form-item-text">F203</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">Type:</p>
                            <p class="content__listroom-item-form-item-text">Basic room</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <p class="content__listroom-item-form-item-topic">View:</p>
                            <p class="content__listroom-item-form-item-text">sea view</p>
                        </div>
                        <div class="content__listroom-item-form-item">
                            <!-- <p class="content__listroom-item-form-item-topic">Cost:</p> -->
                            <p class="content__listroom-item-form-item-text">600$</p>
                        </div>
                    </div>
                    <div class="content__listroom-item-check"></div>
                </div>
            </div>
        </article>
        <footer class="footer"></footer>
    </body>
    <script src="http://localhost:8080/appManageHotel-java-pj/views/user/index.js"></script>
</html>