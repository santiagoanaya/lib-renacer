<template>
  <div class="">
    <div class="center"></div>
    <h1 class="title">Elegí el libro que te gusta y recibilo en tu casa</h1>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
      integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <div class="search-bar">
      <input type="search" @keyup.enter="search" v-model="searchingParameter">
      <i class="fa fa-search" @click="search"></i>
    </div>

    <div class="center" v-if="isLoading">
      <hollow-dots-spinner
        class="loader"
        :dot-size="20"
        :dots-num="5"
        :color="'#ffffff'"
        />
    </div>

    <div class="page-wrapper" v-else>
      <h4 v-if="results">Resultados para: "{{searchingParameter}}"</h4>
      <div class="page-inner" v-for="r in this.results" :key="r.title">
        <div class="row">
          <div class="el-wrapper">
            <div class="box-up">
              <img class="img" :src= r.thumbnail alt="" width="150px">
              <div class="img-info">
                <div class="info-inner">
                  <span class="p-name">{{r.title}}</span>
                  <span class="p-company">{{r.attributes[0].value_name}}</span>
                </div>
                <!-- <div class="a-size">Available sizes : <span class="size">S , M , L , XL</span></div> -->
              </div>
            </div>

            <div class="box-down" v-if="r.price">
              <div class="h-bg">
                <div class="h-bg-inner"></div>
              </div>
              <a class="cart" :href="r.permalink" target="BLANK">
                <span class="price">$ {{r.price}}</span>
                <span class="add-to-cart">
                  <span class="txt">Detalles</span>
                </span>
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { HollowDotsSpinner } from 'epic-spinners'
const rp = require('request-promise');

export default {
  name: 'Search',

  components: {
    HollowDotsSpinner
  },

  data() {
    return {
      searchingParameter: "",
      results: [],
      isLoading: false
    };
  },

  created() {
  },

  methods: {
    search () {
      this.isLoading = true
      const options = {
          uri: `https://api.mercadolibre.com/sites/MLA/search?nickname=TU.LIBRO.YA&q=${this.searchingParameter}`,
          json: true
      }
      rp(options)
        .then((body) => {
          if (body.results.length > 0) {
            this.results = body.results
          }
          else {
          this.results = [{
            title: 'No se han encontrado resultados para tu busqueda',
            thumbnail: 'https://banner2.kisspng.com/20180716/qiq/kisspng-computer-icons-symbol-error-error-icon-5b4c4c02622396.182400931531726850402.jpg',
            /* agregar un icono de error o cara triste */
            attributes: [{value_name:''}],
            permalink: '',
            price: ''
            }]
          }
        })
        .catch((error) => {
            console.log(error)
            this.results = [{
            title: 'No se han encontrado resultados para tu busqueda',
            thumbnail: 'https://banner2.kisspng.com/20180716/qiq/kisspng-computer-icons-symbol-error-error-icon-5b4c4c02622396.182400931531726850402.jpg',
            /* agregar un icono de error o cara triste */
            attributes: [{value_name:''}],
            permalink: '',
            price: ''
            }]
        })
        .finally(() => {
          this.isLoading = false
        })
    }
  }
}
</script>

<style lang="scss" scoped>
body,
html {
  height: 100%;
}

.title {
  background-image: linear-gradient(to right, rgb(70, 172, 206), rgb(88, 175, 189));
}

/* CARDS */
.d-flex {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}

.align-center {
  -webkit-box-align: center;
  -ms-flex-align: center;
  align-items: center;
}

.flex-centerY-centerX {
  justify-content: center;
  -webkit-box-pack: center;
  -ms-flex-pack: center;
  justify-content: center;
  -webkit-box-align: center;
  -ms-flex-align: center;
  align-items: center;
}

body {
  background-color: #f7f7f7;
}

.page-wrapper {
  height: 100%;
  display: flex;
  flex-wrap: wrap;
  padding-left: 10%;
  margin-left:2%;
}

.page-wrapper .page-inner {
  display: table-cell;
  vertical-align: middle;
  padding: 5px;
}

.el-wrapper {
  width: 360px;
  padding: 15px;
  margin: 15px auto;
  background-color: #fff;
  border-radius: 25px;
}

@media (max-width: 991px) {
  .el-wrapper {
    width: 345px;
  }
}

@media (max-width: 767px) {
  .el-wrapper {
    width: 290px;
    margin: 30px auto;
  }
}

.el-wrapper:hover .h-bg {
  left: 0px;
}

.el-wrapper:hover .price {
  left: 20px;
  -webkit-transform: translateY(-50%);
  -ms-transform: translateY(-50%);
  -o-transform: translateY(-50%);
  transform: translateY(-50%);
  color: #818181;
}

.el-wrapper:hover .add-to-cart {
  left: 50%;
}

.el-wrapper:hover .img {
  webkit-filter: blur(7px);
  -o-filter: blur(7px);
  -ms-filter: blur(7px);
  filter: blur(7px);
  filter: progid:DXImageTransform.Microsoft.Blur(pixelradius='7', shadowopacity='0.0');
  opacity: 0.4;
}

.el-wrapper:hover .info-inner {
  bottom: 155px;
}

.el-wrapper:hover .a-size {
  -webkit-transition-delay: 300ms;
  -o-transition-delay: 300ms;
  transition-delay: 300ms;
  bottom: 50px;
  opacity: 1;
}

.el-wrapper .box-down {
  width: 100%;
  height: 60px;
  position: relative;
  overflow: hidden;
}

.el-wrapper .box-up {
  width: 100%;
  height: 300px;
  position: relative;
  overflow: hidden;
  text-align: center;
}

.el-wrapper .img {
  padding: 20px 0;
  -webkit-transition: all 800ms cubic-bezier(0, 0, 0.18, 1);
  -moz-transition: all 800ms cubic-bezier(0, 0, 0.18, 1);
  -o-transition: all 800ms cubic-bezier(0, 0, 0.18, 1);
  transition: all 800ms cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
  -webkit-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -moz-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -o-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
}

.h-bg {
  -webkit-transition: all 800ms cubic-bezier(0, 0, 0.18, 1);
  -moz-transition: all 800ms cubic-bezier(0, 0, 0.18, 1);
  -o-transition: all 800ms cubic-bezier(0, 0, 0.18, 1);
  transition: all 800ms cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
  -webkit-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -moz-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -o-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
  width: 660px;
  height: 100%;
  background-color: #3f96cd;
  position: absolute;
  left: -659px;
}

.h-bg .h-bg-inner {
  width: 50%;
  height: 100%;
  background-color: #464646;
}

.info-inner {
  -webkit-transition: all 400ms cubic-bezier(0, 0, 0.18, 1);
  -moz-transition: all 400ms cubic-bezier(0, 0, 0.18, 1);
  -o-transition: all 400ms cubic-bezier(0, 0, 0.18, 1);
  transition: all 400ms cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
  -webkit-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -moz-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -o-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
  position: absolute;
  width: 100%;
  bottom: 25px;
}

.info-inner .p-name,
.info-inner .p-company {
  display: block;
}

.info-inner .p-name {
  font-family: 'PT Sans', sans-serif;
  font-size: 18px;
  color: #252525;
}

.info-inner .p-company {
  font-family: 'Lato', sans-serif;
  font-size: 12px;
  text-transform: uppercase;
  color: #8c8c8c;
}

.a-size {
  -webkit-transition: all 300ms cubic-bezier(0, 0, 0.18, 1);
  -moz-transition: all 300ms cubic-bezier(0, 0, 0.18, 1);
  -o-transition: all 300ms cubic-bezier(0, 0, 0.18, 1);
  transition: all 300ms cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
  -webkit-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -moz-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -o-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
  position: absolute;
  width: 100%;
  bottom: -20px;
  font-family: 'PT Sans', sans-serif;
  color: #828282;
  opacity: 0;
}

.a-size .size {
  color: #252525;
}

.cart {
  display: block;
  position: absolute;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  font-family: 'Lato', sans-serif;
  font-weight: 700;
}

.cart .price {
  -webkit-transition: all 600ms cubic-bezier(0, 0, 0.18, 1);
  -moz-transition: all 600ms cubic-bezier(0, 0, 0.18, 1);
  -o-transition: all 600ms cubic-bezier(0, 0, 0.18, 1);
  transition: all 600ms cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
  -webkit-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -moz-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -o-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
  -webkit-transition-delay: 100ms;
  -o-transition-delay: 100ms;
  transition-delay: 100ms;
  display: block;
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  -o-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
  font-size: 16px;
  color: #252525;
}

.cart .add-to-cart {
  -webkit-transition: all 600ms cubic-bezier(0, 0, 0.18, 1);
  -moz-transition: all 600ms cubic-bezier(0, 0, 0.18, 1);
  -o-transition: all 600ms cubic-bezier(0, 0, 0.18, 1);
  transition: all 600ms cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
  -webkit-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -moz-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  -o-transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  transition-timing-function: cubic-bezier(0, 0, 0.18, 1);
  /* ease-out */
  -webkit-transition-delay: 100ms;
  -o-transition-delay: 100ms;
  transition-delay: 100ms;
  display: block;
  position: absolute;
  top: 50%;
  left: 110%;
  -webkit-transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  -o-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}

.cart .add-to-cart .txt {
  font-size: 12px;
  color: #fff;
  letter-spacing: 0.045em;
  text-transform: uppercase;
  white-space: nowrap;
}

/* LOADER */

.loader{
  position: relative;
  box-sizing: border-box;
}

.center {
  text-align: center;
  display: flex;
  justify-content: center;
}

/* SEARCH INPUT */
body {
    padding: 0;
    margin: 0;
    background: #07051a;
}

.search-bar{
    position: relative;
    top: 50%;
    left: 50%;
    transform: translate(-50%,-50%);
    transition: all 1s;
    width: 50px;
    height: 50px;
    background: white;
    box-sizing: border-box;
    border-radius: 25px;
    border: 4px solid white;
    padding: 5px;
}

input{
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;;
    height: 42.5px;
    line-height: 30px;
    outline: 0;
    border: 0;
    display: none;
    font-size: 1em;
    border-radius: 20px;
    padding: 0 20px;
}

.fa{
    box-sizing: border-box;
    padding: 10px;
    width: 42.5px;
    height: 42.5px;
    position: absolute;
    top: 0;
    right: 0;
    border-radius: 50%;
    color: #07051a;
    text-align: center;
    font-size: 1.2em;
    transition: all 1s;
}

.search-bar:hover{
    width: 200px;
    cursor: pointer;
}

.search-bar:hover input{
    display: block;
}

.search-bar:hover .fa{
    background: #07051a;
    color: white;
}
</style>
