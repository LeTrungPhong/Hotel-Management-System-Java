<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="http://localhost:8080/appManageHotel-java-pj/Homecss" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet" />
<script crossorigin
	src="https://unpkg.com/react@17/umd/react.development.js"></script>
<script crossorigin
	src="https://unpkg.com/react-dom@17/umd/react-dom.development.js"></script>
<script src="https://unpkg.com/babel-standalone@6/babel.min.js"></script>
<title>Trang chu</title>
</head>
<body class="container">
	<section class="background-sign"></section>
	<section class="sign background-color-sign box-shadow-sign">
		<div class="sign-times">
			<i class="fas fa-cut sign-times__img"></i>
		</div>
		<div class="sign-account">
			<div class="sign-account-in">
				<h1 class="sign-account-in__title">Sign in</h1>
				<div class="sign-account-in__network">
					<i class="fab fa-facebook-f sign-account-in__network-item"></i> <i
						class="fab fa-google-plus-g sign-account-in__network-item"></i> <i
						class="fab fa-linkedin-in sign-account-in__network-item"></i>
				</div>
				<p class="sign-account-in__desc">or use your account</p>
				<form action="" class="sign-account-in-form" method="">
					<input type="text" class="sign-account-in-form__input"
						placeholder="Email" name=""> <input type="text"
						class="sign-account-in-form__input" placeholder="Password" name="">
					<a href="#" class="sign-account-in-form__link-forget">Forgot
						your password ?</a> <input class="sign-account-in-form__submit"
						value="SIGN IN" type="submit">
				</form>
			</div>
			<div class="sign-account-up">
				<h1 class="sign-account-up__title">Create Account</h1>
				<div class="sign-account-up__network">
					<i class="fab fa-facebook-f sign-account-up__network-item"></i> <i
						class="fab fa-google-plus-g sign-account-up__network-item"></i> <i
						class="fab fa-linkedin-in sign-account-up__network-item"></i>
				</div>
				<p class="sign-account-up__desc">or use your email for
					registration</p>
				<form action="" class="sign-account-up-form" method="">
					<input type="text" class="sign-account-up-form__input"
						placeholder="Name" name=""> <input type="text"
						class="sign-account-up-form__input" placeholder="Email" name="">
					<input type="text" class="sign-account-up-form__input"
						placeholder="Password" name=""> <input
						class="sign-account-up-form__submit" type="submit" value="SIGN UP">
				</form>
			</div>
		</div>
		<div class="sign-move">
			<div class="sign-move-up">
				<h1 class="sign-move-up__title">Hello, Friend!</h1>
				<p class="sign-move-up__desc">Enter your personal details and
					start journey with us</p>
				<button class="sign-move-up__button">SIGN UP</button>
			</div>
			<div class="sign-move-in">
				<h1 class="sign-move-in__title">Welcome Back!</h1>
				<p class="sign-move-in__desc">To keep connected with us please
					login with your personal info</p>
				<button class="sign-move-in__button">SIGN IN</button>
			</div>
		</div>
	</section>
	<header class="header">
		<div class="header__dashboard-name">Manage Hotel</div>
		<div class="header__dashboard">
			<div class="header__dashboard-search">
				<input type="text" class="header__dashboard-search__input"
					placeholder="Search for anything..." />
			</div>
			<div class="header__dashboard-notification">
				<i class="far fa-bell header__dashboard-notification-icon"></i>
			</div>
			<div class="header__dashboard-account">
				<i class="far fa-user header__dashboard-account-avatar"></i>
				<div class="header__dashboard-account-name">
					<p class="header__dashboard-account-name-text">Le Trung Phong</p>
				</div>
				<div class="header__dashboard-account-job">
					<p class="header__dashboard-account-job-text">Sinh vien</p>
				</div>
				<i class="fas fa-chevron-down header__dashboard-account-nav-img"></i>

				<div class="header__dashboard-account-nav dp-n">
					<a href="#" class="header__dashboard-account-nav-item">Sign
						in</a> <a href="#" class="header__dashboard-account-nav-item">Sign
						up</a>
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
				<i class="fas fa-briefcase nav__list-item-img"></i> <a href=""
					class="nav__list-item-text">Check in</a>
			</div>
			<div class="nav__list-item">
				<i class="fas fa-briefcase nav__list-item-img"></i> <a href=""
					class="nav__list-item-text">Book room</a>
			</div>
			<div class="nav__list-item">
				<i class="fas fa-briefcase nav__list-item-img"></i> <a href=""
					class="nav__list-item-text">Confirm</a>
			</div>
			<div class="nav__list-item">
				<i class="fas fa-briefcase nav__list-item-img"></i> <a href=""
					class="nav__list-item-text">Service</a>
			</div>
			<div class="nav__list-item">
				<i class="fas fa-briefcase nav__list-item-img"></i> <a href=""
					class="nav__list-item-text">Check out</a>
			</div>
			<div class="nav__list-item">
				<i class="fas fa-briefcase nav__list-item-img"></i> <a href=""
					class="nav__list-item-text">Manage</a>
			</div>
		</div>
	</nav>

	<article class="content">
		<%-- 
        <section class="content__tool">
                <div class="content__tool-item">
                    <div class="content__tool-item-first">INSERT</div>
                    <div class="content__tool-item-second"></div>
                    <div class="content__tool-item-third"></div>
                </div>
                <div class="content__tool-item">
                    <div class="content__tool-item-first">DELETE</div>
                    <div class="content__tool-item-second"></div>
                    <div class="content__tool-item-third"></div>
                </div>
                <div class="content__tool-item">
                    <div class="content__tool-item-first">UPDATE</div>
                    <div class="content__tool-item-second"></div>
                    <div class="content__tool-item-third"></div>
                </div>
            </section>
        --%>


		<form class="content-form__tool" method="POST" action="">
			<h1 class="content-form__tool-title"></h1>
			<div class="content-form__tool-item">
				<div class="content-form__tool-item-topic">ID</div>
				<input type="text" class="content-form__tool-item-text" name="id">
			</div>
			<div class="content-form__tool-item">
				<div class="content-form__tool-item-topic">Type</div>
				<input type="text" class="content-form__tool-item-text"
					name="TypeRoom">
			</div>
			<div class="content-form__tool-item">
				<div class="content-form__tool-item-topic">View</div>
				<input type="text" class="content-form__tool-item-text" name="">
			</div>
			<div class="content-form__tool-item">
				<div class="content-form__tool-item-topic">Cost</div>
				<input type="text" class="content-form__tool-item-text" name="Money">
			</div>
			<div class="content-form__tool-submit">
				<div class="content-form__tool-submit-cancel">CANCEL</div>
				<input type="submit" class="content-form__tool-submit-confirm"
					value="CONFIRM">
			</div>
			<input type="text" style="display: none" name="requestMethod"
				class="content-form__tool-method">
		</form>

		<table class="content__listroom"></table>
	</article>
	<footer class="footer"></footer>
	<script type="text/babel">
            function ContentListItemForm(course){
                return (
                    <tr className="content__listroom-item">
                        <td className="content__listroom-item-id">{course.id}</td>
                        <td className="content__listroom-item-TypeRoom">{course.TypeRoom}</td>
                        <td className={`content__listroom-item-Money ${course.Check?"color-green":"color-red"}`}>{course.Money}</td>
                        <td className="content__listroom-item-check">
                            {course.Check?<input type="checkbox" name="" id="" disabled checked/>:<input type="checkbox" name="" id="" disabled/>}
                        </td>
                        <td className="content__listroom-item-img">
                            <i className="fa fa-pen content__listroom-item-img-item update"></i>
                            <i className="fa fa-trash content__listroom-item-img-item delete"></i>
                            <i className="fa fa-book-open content__listroom-item-img-item desc"></i>
                        </td>
                    </tr>
                )
            }

            function RenderContentListItemForm(courses){
                console.log(courses.APIcourse);
                return (
                    <React.Fragment>
                        <div className="content__listroom-search">
                            <i class="fa fa-folder-open content__listroom-search-img"></i>
                            <div className="content__listroom-search-input-form">
                                <input className="content__listroom-search-input" type="text" placeholder=" Search"/>
                                <img className="content__listroom-search-input-img" src="./assets/img/magnifying-glass-solid.svg" alt=""/>
                            </div>
                        </div>
                        <button className="content__listroom-button"><i className="fa fa-plus content__listroom-button-img"></i> Insert room</button>
                        <tr className="content__listroom-space">
                        </tr>
                        <tr className="content__listroom-item">
                            <td className="content__listroom-item-id">ID <i class="fa fa-sort content__listroom-item-icon"></i></td>
                            <td className="content__listroom-item-TypeRoom">TypeRoom <i class="fa fa-sort content__listroom-item-icon"></i></td>
                            <td className="content__listroom-item-Money"><i class="fa fa-dollar-sign content__listroom-item-icon"></i> Money</td>
                            <td className="content__listroom-item-check">Check <i class="fa fa-check content__listroom-item-icon"></i></td>
                            <td className="content__listroom-item-img"></td>
                        </tr>
                        {courses.APIcourse.map(function(course){
                                return (
                                        <ContentListItemForm 
                                            id = {course.id}
                                            TypeRoom = {course.TypeRoom}
                                            Money = {course.Money}
                                            Check = {course.Check}
                                        />
                                        )
                                    })}
                    </React.Fragment>
                )
            }

			var courseAPI = 'http://localhost:3000/Room';
			fetch(courseAPI)
    			.then(res => res.json())
    			.then(function(courses){
                    // console.log(courses);
                    ReactDOM.render(<RenderContentListItemForm
                        APIcourse={courses}
                    />,document.querySelector('.content__listroom'));
    			});
		</script>
</body>
<script
	src="http://localhost:8080/appManageHotel-java-pj/Homejs"></script>
</html>