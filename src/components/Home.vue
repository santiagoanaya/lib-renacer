<template>
<body>
  <div class="title-container">
    <h1 class="title">Libreria renacer</h1>
    <h1 class="title-down">Todos los libros <br>En un solo lugar</h1>
  </div>

  <fieldset class="field-container">
    <input type="text" placeholder="Search..." class="field" />
    <div class="icons-container">
      <div class="icon-search"></div>
      <div class="icon-close">
      <div class="x-up"></div>
      <div class="x-down"></div>  
    </div>
  </div>
</fieldset>
</body>
</template>

<script>

export default {

}
</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style lang="scss">
// @import "/src/css/style.css";
// @import "/src/css/yxqdlj.css";
// @import "/src/scss/style.scss";

@import url(https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css);

//SCSS 

@import url(https://fonts.googleapis.com/css?family=Montserrat);

$hint: #FAF8F8;
$turqoise: #98DAE8;
$cornflower-blue: #6078EA;
$tundora: #4B4848;
$electric-violet: #7C26F8;
$snappy: cubic-bezier(0.694, 0.048, 0.335, 1.000);

@keyframes spin {
    0% {
        transform: rotate(0deg);
    }

    100% {
        transform: rotate(360deg);
    }
}

@keyframes color-1 {
    0% {
        background-color: #EB73B9;
    }

    100% {
        background-color: #98DAE8;
    }
}

::selection {
    background: $cornflower-blue;
    color: white;
    text-shadow: none;
}

::-webkit-selection {
    background: $cornflower-blue;
    color: white;
    text-shadow: none;
}

body {
    font-family: 'Montserrat', 'Helevtica', sans-serif;
    position: relative;
    width: 100%;
    height: 100vh;
    background-color: darken($hint, 4%);
    color: $tundora;
    display: flex;
    justify-content: center;
    align-items: center;
    transition: background-color 1.25s ease-in-out;

    &.is-focus {
        background-color: $turqoise;
    }
}

.title-container {
    position: absolute;
    top: 38%;
    left: 50%;
    width: 80%;
    margin: 0 auto;
    text-align: center;
    overflow: hidden;
    transform: translate(-50%, -50%);

    .title {
        transform: translateY(-100%);
        transition: transform 0.3s ease;
        transition-delay: 0.25s;
        margin: 0;
        color: $cornflower-blue;
    }

    .title-down {
        transform: translateY(100%);
        transition: transform 0.3s ease;
        transition-delay: 0.25s;
        margin: 0;
        color: $cornflower-blue;
    }

    .is-focus & {
        .title {
            transform: translateY(0);
        }
    }

    .is-type & {
        .title-down {
            transform: translateY(-30px);
        }

        .title {
            transform: translateY(-100%);
        }
    }
}

.field-container {
    position: relative;
    padding: 0;
    margin: 0;
    border: 0;
    width: 330px;
    height: 40px;
}

.icons-container {
    position: absolute;
    top: 11px;
    right: -25px;
    width: 35px;
    height: 35px;
    overflow: hidden;
}

.icon-close {
    position: absolute;
    top: 2px;
    left: 2px;
    width: 75%;
    height: 75%;
    opacity: 0;
    cursor: pointer;
    transform: translateX(-200%);
    border-radius: 50%;
    transition: opacity 0.25s ease, transform 0.43s $snappy;

    &:before {
        content: "";
        border-radius: 50%;
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        opacity: 0;
        border: 2px solid transparent;
        border-top-color: $cornflower-blue;
        border-left-color: $cornflower-blue;
        border-bottom-color: $cornflower-blue;
        transition: opacity 0.2s ease;
    }

    .x-up {
        position: relative;
        width: 100%;
        height: 50%;

        &:before {
            content: "";
            position: absolute;
            bottom: 2px;
            left: 3px;
            width: 50%;
            height: 2px;
            background-color: $cornflower-blue;
            transform: rotate(45deg);
        }

        &:after {
            content: "";
            position: absolute;
            bottom: 2px;
            right: 0px;
            width: 50%;
            height: 2px;
            background-color: $cornflower-blue;
            transform: rotate(-45deg);
        }
    }

    .x-down {
        position: relative;
        width: 100%;
        height: 50%;

        &:before {
            content: "";
            position: absolute;
            top: 5px;
            left: 4px;
            width: 50%;
            height: 2px;
            background-color: $cornflower-blue;
            transform: rotate(-45deg);
        }

        &:after {
            content: "";
            position: absolute;
            top: 5px;
            right: 1px;
            width: 50%;
            height: 2px;
            background-color: $cornflower-blue;
            transform: rotate(45deg);
        }
    }

    .is-type & {
        &:before {
            opacity: 1;
            animation: spin 0.85s infinite;
        }

        .x-up {

            &:before,
            &:after {
                animation: color-1 0.85s infinite;
            }

            &:after {
                animation-delay: 0.3s;
            }
        }

        .x-down {

            &:before,
            &:after {
                animation: color-1 0.85s infinite;
            }

            &:before {
                animation-delay: 0.2s;
            }

            &:after {
                animation-delay: 0.1s;
            }
        }
    }
}

.icon-search {
    position: relative;
    top: 5px;
    left: 8px;
    width: 50%;
    height: 50%;
    opacity: 1;
    border-radius: 50%;
    border: 3px solid mix($cornflower-blue, white, 35%);
    transition: opacity 0.25s ease, transform 0.43s $snappy;

    &:after {
        content: "";
        position: absolute;
        bottom: -9px;
        right: -2px;
        width: 4px;
        border-radius: 3px;
        transform: rotate(-45deg);
        height: 10px;
        background-color: mix($cornflower-blue, white, 35%);
    }
}

.field {
    border: 0;
    width: 100%;
    height: 100%;
    padding: 10px 20px;
    background: white;
    border-radius: 3px;
    box-shadow: 0px 8px 15px rgba($tundora, 0.1);
    transition: all 0.4s ease;

    &:focus {
        outline: none;
        box-shadow: 0px 9px 20px rgba($tundora, 0.3);

        + .icons-container {
            .icon-close {
                opacity: 1;
                transform: translateX(0);
            }

            .icon-search {
                opacity: 0;
                transform: translateX(200%);
            }
        }
    }
}


//////style.css

@import url(https://fonts.googleapis.com/css?family=Montserrat);
@-webkit-keyframes spin {
  0% {
    -webkit-transform: rotate(0deg);
            transform: rotate(0deg);
  }
  100% {
    -webkit-transform: rotate(360deg);
            transform: rotate(360deg);
  }
}
@keyframes spin {
  0% {
    -webkit-transform: rotate(0deg);
            transform: rotate(0deg);
  }
  100% {
    -webkit-transform: rotate(360deg);
            transform: rotate(360deg);
  }
}
@-webkit-keyframes color-1 {
  0% {
    background-color: #EB73B9;
  }
  100% {
    background-color: #98DAE8;
  }
}
@keyframes color-1 {
  0% {
    background-color: #EB73B9;
  }
  100% {
    background-color: #98DAE8;
  }
}
::-moz-selection {
  background: #6078EA;
  color: white;
  text-shadow: none;
}
::selection {
  background: #6078EA;
  color: white;
  text-shadow: none;
}

::-webkit-selection {
  background: #6078EA;
  color: white;
  text-shadow: none;
}

body {
  font-family: 'Montserrat', 'Helevtica', sans-serif;
  position: relative;
  width: 100%;
  height: 100vh;
  background-color: #f2ecec;
  color: #4B4848;
  display: flex;
  justify-content: center;
  align-items: center;
  transition: background-color 1.25s ease-in-out;
}
body.is-focus {
  background-color: #98DAE8;
}

.title-container {
  position: absolute;
  top: 38%;
  left: 50%;
  width: 80%;
  margin: 0 auto;
  text-align: center;
  overflow: hidden;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
}
.title-container .title {
  -webkit-transform: translateY(-100%);
          transform: translateY(-100%);
  transition: -webkit-transform 0.3s ease;
  transition: transform 0.3s ease;
  transition: transform 0.3s ease, -webkit-transform 0.3s ease;
  transition-delay: 0.25s;
  margin: 0;
  color: #6078EA;
}
.title-container .title-down {
  -webkit-transform: translateY(100%);
          transform: translateY(100%);
  transition: -webkit-transform 0.3s ease;
  transition: transform 0.3s ease;
  transition: transform 0.3s ease, -webkit-transform 0.3s ease;
  transition-delay: 0.25s;
  margin: 0;
  color: #6078EA;
}
.is-focus .title-container .title {
  -webkit-transform: translateY(0);
          transform: translateY(0);
}
.is-type .title-container .title-down {
  -webkit-transform: translateY(-30px);
          transform: translateY(-30px);
}
.is-type .title-container .title {
  -webkit-transform: translateY(-100%);
          transform: translateY(-100%);
}

.field-container {
  position: relative;
  padding: 0;
  margin: 0;
  border: 0;
  width: 330px;
  height: 40px;
}

.icons-container {
  position: absolute;
  top: 11px;
  right: -25px;
  width: 35px;
  height: 35px;
  overflow: hidden;
}

.icon-close {
  position: absolute;
  top: 2px;
  left: 2px;
  width: 75%;
  height: 75%;
  opacity: 0;
  cursor: pointer;
  -webkit-transform: translateX(-200%);
          transform: translateX(-200%);
  border-radius: 50%;
  transition: opacity 0.25s ease, -webkit-transform 0.43s cubic-bezier(0.694, 0.048, 0.335, 1);
  transition: opacity 0.25s ease, transform 0.43s cubic-bezier(0.694, 0.048, 0.335, 1);
  transition: opacity 0.25s ease, transform 0.43s cubic-bezier(0.694, 0.048, 0.335, 1), -webkit-transform 0.43s cubic-bezier(0.694, 0.048, 0.335, 1);
}
.icon-close:before {
  content: "";
  border-radius: 50%;
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  opacity: 0;
  border: 2px solid transparent;
  border-top-color: #6078EA;
  border-left-color: #6078EA;
  border-bottom-color: #6078EA;
  transition: opacity 0.2s ease;
}
.icon-close .x-up {
  position: relative;
  width: 100%;
  height: 50%;
}
.icon-close .x-up:before {
  content: "";
  position: absolute;
  bottom: 2px;
  left: 3px;
  width: 50%;
  height: 2px;
  background-color: #6078EA;
  -webkit-transform: rotate(45deg);
          transform: rotate(45deg);
}
.icon-close .x-up:after {
  content: "";
  position: absolute;
  bottom: 2px;
  right: 0px;
  width: 50%;
  height: 2px;
  background-color: #6078EA;
  -webkit-transform: rotate(-45deg);
          transform: rotate(-45deg);
}
.icon-close .x-down {
  position: relative;
  width: 100%;
  height: 50%;
}
.icon-close .x-down:before {
  content: "";
  position: absolute;
  top: 5px;
  left: 4px;
  width: 50%;
  height: 2px;
  background-color: #6078EA;
  -webkit-transform: rotate(-45deg);
          transform: rotate(-45deg);
}
.icon-close .x-down:after {
  content: "";
  position: absolute;
  top: 5px;
  right: 1px;
  width: 50%;
  height: 2px;
  background-color: #6078EA;
  -webkit-transform: rotate(45deg);
          transform: rotate(45deg);
}
.is-type .icon-close:before {
  opacity: 1;
  -webkit-animation: spin 0.85s infinite;
          animation: spin 0.85s infinite;
}
.is-type .icon-close .x-up:before, .is-type .icon-close .x-up:after {
  -webkit-animation: color-1 0.85s infinite;
          animation: color-1 0.85s infinite;
}
.is-type .icon-close .x-up:after {
  -webkit-animation-delay: 0.3s;
          animation-delay: 0.3s;
}
.is-type .icon-close .x-down:before, .is-type .icon-close .x-down:after {
  -webkit-animation: color-1 0.85s infinite;
          animation: color-1 0.85s infinite;
}
.is-type .icon-close .x-down:before {
  -webkit-animation-delay: 0.2s;
          animation-delay: 0.2s;
}
.is-type .icon-close .x-down:after {
  -webkit-animation-delay: 0.1s;
          animation-delay: 0.1s;
}

.icon-search {
  position: relative;
  top: 5px;
  left: 8px;
  width: 50%;
  height: 50%;
  opacity: 1;
  border-radius: 50%;
  border: 3px solid #c7d0f8;
  transition: opacity 0.25s ease, -webkit-transform 0.43s cubic-bezier(0.694, 0.048, 0.335, 1);
  transition: opacity 0.25s ease, transform 0.43s cubic-bezier(0.694, 0.048, 0.335, 1);
  transition: opacity 0.25s ease, transform 0.43s cubic-bezier(0.694, 0.048, 0.335, 1), -webkit-transform 0.43s cubic-bezier(0.694, 0.048, 0.335, 1);
}
.icon-search:after {
  content: "";
  position: absolute;
  bottom: -9px;
  right: -2px;
  width: 4px;
  border-radius: 3px;
  -webkit-transform: rotate(-45deg);
          transform: rotate(-45deg);
  height: 10px;
  background-color: #c7d0f8;
}

.field {
  border: 0;
  width: 100%;
  height: 100%;
  padding: 10px 20px;
  background: white;
  border-radius: 3px;
  box-shadow: 0px 8px 15px rgba(75, 72, 72, 0.1);
  transition: all 0.4s ease;
}
.field:focus {
  outline: none;
  box-shadow: 0px 9px 20px rgba(75, 72, 72, 0.3);
}
.field:focus + .icons-container .icon-close {
  opacity: 1;
  -webkit-transform: translateX(0);
          transform: translateX(0);
}
.field:focus + .icons-container .icon-search {
  opacity: 0;
  -webkit-transform: translateX(200%);
          transform: translateX(200%);
}

//////// NAVBAR CSS

*,
*:before,
*:after {
  box-sizing: border-box;
}
body {
  background-color: #f5f5f5;
  color: #333;
  font-size: 14px;
  font-family: Verdana, Arial, sans-serif;
  line-height: 20px;
}
a {
  text-decoration: none;
  transition: all 0.3s linear 0s;
}
.area {
  display: flex;
  flex-flow: row wrap;
  align-items: stretch;
  margin-left: auto;
  margin-right: auto;
}
@media (min-width: 768px) {
  .area {
    width: 750px;
  }
}
@media (min-width: 992px) {
  .area {
    width: 970px;
  }
}
@media (min-width: 1200px) {
  .area {
    width: 1140px;
  }
}
.navbar-component {
  background-color: #fff;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.16), 0 2px 10px rgba(0, 0, 0, 0.12);
}
.navbar-component > .navbar {
  justify-content: space-between;
}
.navbar > .brand {
  display: block;
  font-size: 16px;
  color: #777;
  margin: 22px;
}
.navbar > .toggle {
  outline: none;
  border: 0;
  display: inline-block;
  background-color: transparent;
  background-image: none;
  vertical-align: middle;
  text-align: center;
  white-space: nowrap;
  cursor: pointer;
  touch-action: manipulation;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  padding: 22px;
}
@media (min-width: 768px) {
  .navbar > .toggle {
    display: none;
  }
}
.navbar > .toggle > .icon {
  position: relative;
  margin-top: 8px;
  margin-bottom: 8px;
}
.navbar > .toggle > .icon,
.navbar > .toggle > .icon:before,
.navbar > .toggle > .icon:after {
  display: block;
  width: 24px;
  height: 3px;
  transition: background-color 0.3s linear, -webkit-transform 0.3s linear;
  transition: background-color 0.3s linear, transform 0.3s linear;
  transition: background-color 0.3s linear, transform 0.3s linear, -webkit-transform 0.3s linear;
  background-color: #555555;
}
.navbar > .toggle > .icon:before,
.navbar > .toggle > .icon:after {
  position: absolute;
  content: "";
}
.navbar > .toggle > .icon:before {
  top: -8px;
}
.navbar > .toggle > .icon:after {
  top: 8px;
}
.navbar > .toggle.-active > .icon {
  background-color: transparent;
}
.navbar > .toggle.-active > .icon:before {
  -webkit-transform: translateY(8px) rotate(45deg);
          transform: translateY(8px) rotate(45deg);
}
.navbar > .toggle.-active > .icon:after {
  -webkit-transform: translateY(-8px) rotate(-45deg);
          transform: translateY(-8px) rotate(-45deg);
}
.navbar > .list {
  display: none;
  flex-flow: row nowrap;
  align-items: center;
  white-space: nowrap;
}
@media (min-width: 768px) {
  .navbar > .list {
    display: flex;
  }
}
@media (max-width: 768px) {
  .navbar > .list {
    position: fixed;
    top: 64px;
    left: 0;
    width: 100%;
    overflow-y: hidden;
    overflow-x: auto;
    border-top: 1px solid #ddd;
    background-color: #fff;
  }
}
.navbar > .list.-on {
  display: flex;
}
.navbar > .list > .item {
  display: block;
  flex-shrink: 0;
  height: 64px;
  line-height: 64px;
  padding-left: 22px;
  padding-right: 22px;
  text-transform: uppercase;
  color: #555;
  font-size: 14px;
}
.navbar > .list > .item.-link {
  line-height: 68px;
  color: #555;
  border-bottom: 4px solid transparent;
}
.navbar > .list > .item.-link.-active,
.navbar > .list > .item.-link:hover,
.navbar > .list > .item.-link:focus {
  color: #333;
  border-bottom-color: #673ab7;
}



</style>
