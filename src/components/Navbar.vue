<template>
  <nav>
    <div class="menu-container">
      <ul class="menu">
        <li class="menu-apple" style="padding-top:2.8%">
          <img src="http://www.renacerlibreria.com/wp-content/uploads/2019/03/cropped-LOGO.jpg" width="100" height="50" alt="Computer Hope" >
        </li>
        <li class="menu-mac" style="margin-bottom:3%">
          <router-link to="/">Inicio</router-link>
        </li>
        <li class="menu-mac" style="margin-bottom:3%">
          <router-link to="/contacto">Contacto</router-link>
        </li>
        <li class="menu-mac" style="margin-bottom:3%">
          <a href="tel: 1136485582">
            <span>Teléfono: 11 3648-5582</span>
          </a>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script>

export default {
  name: 'Navbar',
}
</script>

<style>
* {
  box-sizing: inherit;
  margin: 0;
  padding: 0;
}

html {
  height: 100%;
  box-sizing: border-box;
}

body {
  width: 100%;
  min-height: 100vh;
  background-image: linear-gradient(to right, rgb(70, 172, 206), rgb(88, 175, 189));
  display: flex;
  align-items: center;
  justify-content: center;
  font-family: 'PT Sans', sans-serif;
}

.search {
  width: 450px;
  height: 120px;
  position: relative;
  overflow: hidden;
}
.search-input {
  width: 100%;
  height: 100%;
  padding: 0 65px 25px 60px;
  position: absolute;
  z-index: 1;
  border: none;
  outline: none;
  background-color: rgba(255, 255, 255, 0.15);
  color: #ddd;
  font-size: 28px;
  letter-spacing: .3px;
  -webkit-transform-origin: 10%;
          transform-origin: 10%;
  -webkit-transform: scaleX(0);
          transform: scaleX(0);
  font-family: 'PT Sans', sans-serif;
}
.search-button {
  position: absolute;
  right: 60px;
  bottom: 33px;
  width: 50px;
  height: 50px;
  border-radius: 50%;
  border: 3px solid #fff;
  background-color: transparent;
  cursor: pointer;
  outline: none;
  -webkit-transform: rotate(45deg);
          transform: rotate(45deg);
  -webkit-tap-highlight-color: transparent;
}
.search-button::-moz-focus-inner {
  border: 0;
}
.search-label {
  position: absolute;
  top: 0;
  left: 60px;
  width: 350px;
  height: 77px;
  line-height: 95px;
  color: #ddd;
  font-size: 28px;
  letter-spacing: .3px;
  pointer-events: none;
  overflow: hidden;
}
.search-label div {
  white-space: pre;
}
.search-border {
  width: 25px;
  height: 3px;
  position: absolute;
  right: 47px;
  bottom: 32px;
  -webkit-transform: rotate(45deg);
          transform: rotate(45deg);
  background-color: #fff;
  cursor: pointer;
}
.search-text {
  opacity: 0;
  pointer-events: none;
}
.search:before {
  content: '';
  position: absolute;
  width: 3px;
  height: 18px;
  left: 40px;
  top: 40px;
  background-color: #fff;
  opacity: 0;
  transition: opacity .3s;
}
.search.edge:before {
  opacity: 1;
}
.search-close {
  position: absolute;
  right: 15px;
  top: 5px;
  z-index: 5;
  color: #fff;
  font-size: 24px;
  cursor: pointer;
  opacity: 0;
  pointer-events: none;
  transition: opacity .4s;
}
.search-close.visible {
  opacity: 1;
  pointer-events: auto;
  transition-delay: .4s;
}

input::-ms-clear {
  display: none;
}






.vh {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.fade-screen {
  background: #fcfbfb;
  visibility: hidden;
  position: fixed;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1;
}

@-webkit-keyframes specialFadeIn {
  from {
    opacity: 0;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  to {
    opacity: 1;
  }
}

@keyframes specialFadeIn {
  from {
    opacity: 0;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  to {
    opacity: 1;
  }
}
.specialFadeIn {
  -webkit-animation-name: specialFadeIn;
          animation-name: specialFadeIn;
}

@-webkit-keyframes specialFadeOut {
  from {
    opacity: 1;
  }
  to {
    opacity: 0;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}

@keyframes specialFadeOut {
  from {
    opacity: 1;
  }
  to {
    opacity: 0;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}
.specialFadeOut {
  -webkit-animation-name: specialFadeOut;
          animation-name: specialFadeOut;
}

@-webkit-keyframes specialSlideInRight {
  from {
    -webkit-transform: translate3d(10%, 0, 0);
            transform: translate3d(10%, 0, 0);
    visibility: visible;
  }
  to {
    -webkit-transform: translate3d(0, 0, 0);
            transform: translate3d(0, 0, 0);
  }
}

@keyframes specialSlideInRight {
  from {
    -webkit-transform: translate3d(10%, 0, 0);
            transform: translate3d(10%, 0, 0);
    visibility: visible;
  }
  to {
    -webkit-transform: translate3d(0, 0, 0);
            transform: translate3d(0, 0, 0);
  }
}
.specialSlideInRight {
  -webkit-animation-name: specialSlideInRight;
          animation-name: specialSlideInRight;
}

@-webkit-keyframes specialFadeInRight {
  from {
    opacity: 0;
    -webkit-transform: translate3d(10%, 0, 0);
            transform: translate3d(10%, 0, 0);
  }
  to {
    opacity: 1;
    -webkit-transform: none;
            transform: none;
  }
}

@keyframes specialFadeInRight {
  from {
    opacity: 0;
    -webkit-transform: translate3d(10%, 0, 0);
            transform: translate3d(10%, 0, 0);
  }
  to {
    opacity: 1;
    -webkit-transform: none;
            transform: none;
  }
}
.spceialFadeInRight {
  -webkit-animation-name: specialFadeInRight;
          animation-name: specialFadeInRight;
}


.visible {
  visibility: visible;
}

.hidden {
  display: none;
  transition: opacity 0.2s cubic-bezier(0.645, 0.045, 0.355, 1);
}

.menu ul li {
  transition: opacity 0.2s cubic-bezier(0.645, 0.045, 0.355, 1);
}


.menu-mac.is-closed {
  -webkit-animation-name: specialFadeIn;
          animation-name: specialFadeIn;
  -webkit-animation-delay: 30ms;
          animation-delay: 30ms;
  -webkit-animation-duration: 400ms;
          animation-duration: 400ms;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
}
.menu-mac.hidden {
  -webkit-animation-name: specialFadeOut;
          animation-name: specialFadeOut;
  -webkit-animation-delay: 245ms;
          animation-delay: 245ms;
  -webkit-animation-duration: 400ms;
          animation-duration: 400ms;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
}

.menu-iPad.is-closed {
  -webkit-animation-name: specialFadeIn;
          animation-name: specialFadeIn;
  -webkit-animation-delay: 70ms;
          animation-delay: 70ms;
  -webkit-animation-duration: 400ms;
          animation-duration: 400ms;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
}

nav {
  position: absolute;
  top: 0;
  right: 0;
  left: 0;
  height: 48px;
  min-width: 1024px;
  background: rgb(255, 255, 255);
  font-size: 18px;
  z-index: 2;
}

.menu-container {
  position: relative;
  margin: 0 auto;
  max-width: 1000px;
  padding: 0 23px;
}
.menu-container ul {
  list-style: none;
  margin-top:-1.5%;
}
.menu-container ul li {
  display: inline-block;
  text-align: center;
  width: auto;
  margin-right: 76px;
  margin-top:-3.3%;
}
.menu-container ul li:last-child {
  margin-left: 30%;
  margin-right:0;
  padding-left:0;
}
.menu-container ul li a {
  display: inline-block;
  font-family: -apple-system, BlinkMacSystemFont,  "Segoe UI", "Roboto", "Oxygen", "Ubuntu", "Cantarell",  "Fira Sans", "Droid Sans", "Helvetica Neue",  sans-serif;
  text-decoration: none;
  color: #000000;
  font-weight: 100;
  font-size: 16px;
  float: right;
  text-align: right;
}
.menu-container ul li a:hover {
  color: #969696;
}
.menu-container.menu-apple {
  background-repeat: no-repeat;
  width: 30px;
  margin-top: 10x;
  padding-top:2px;
}

.menu-container.menu-mac {
  margin-bottom:5px;
}

.menu-apple {
  background-repeat: no-repeat;
  width: 30px;
  padding-top:15px;
  margin-top:1.5%;
}

.apple-icon {
  font-size: 20px;
  margin-top: 0;
}


* {
  box-sizing: border-box
}

html {
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  font-family: 'Dosis', sans-serif;
  line-height: 1.6;
  color: #666;
  background: #F6F6F6;
}

#root {
  max-width: 1200px;
  margin: 0 auto;
}

h1 {
  text-align: center;
  padding: 1.5rem 2.5rem;
  background-image: linear-gradient(120deg, #fbc2eb 0%, #a6c1ee 100%);
  margin: 0 0 2rem 0;
  font-size: 1.5rem;
  color: white;
}

img {
  display: block;
  margin: 1rem auto;
  max-width: 100%;
}

p {
  padding: 0 2.5rem 2.5rem;
  margin: 0;
}

.container2 {
  display: flex;
  flex-wrap: wrap;
}

.card {
  margin: 1rem;
  background: white;
  box-shadow: 2px 4px 25px rgba(0, 0, 0, .1);
  border-radius: 12px;
  overflow: hidden;
  transition: all .2s linear;
}

.card:hover {
  box-shadow: 2px 8px 45px rgba(0, 0, 0, .15);
  transform: translate3D(0, -2px, 0);
}

@media screen and (min-width: 600px) {
  .card {
    flex: 1 1 calc(50% - 2rem);
  }
}

@media screen and (min-width: 900px) {
  .card {
    flex: 1 1 calc(33% - 2rem);
  }
}

.card:nth-child(2n) h1 {
  background-image: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%);
}

.card:nth-child(4n) h1 {
  background-image: linear-gradient(120deg, #ff9a9e 0%, #fecfef 100%);
}

.card:nth-child(5n) h1 {
  background-image: linear-gradient(120deg, #ffc3a0 0%, #ffafbd 100%);
}

</style>
