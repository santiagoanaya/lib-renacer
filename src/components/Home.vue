<template>
  <div class="hello">
    <h1>MERCADOPAGO</h1>
    <a href="<?php echo $preference->init_point; ?>">Pay</a>
  </div>
</template>

<script>
export default {
  name: 'Home',
  props: {
    msg: String,
    preference: {
      "items": [
          {
              "id": "item-ID-1234",
              "title": "Title of what you are paying for. It will be displayed in the payment process.",
              "currency_id": "CLP",
              "picture_url": "https://www.mercadopago.com/org-img/MP3/home/logomp3.gif",
              "description": "Item description",
              "category_id": "art", // Available categories at https://api.mercadopago.com/item_categories
              "quantity": 1,
              "unit_price": 100
          }
      ],
      "payer": {
          "name": "user-name",
          "surname": "user-surname",
          "email": "user@email.com",
          "date_created": "2015-06-02T12:58:41.425-04:00",
          "phone": {
              "area_code": "11",
              "number": "4444-4444"
          },
          "identification": {
              "type": "RUT", // Available ID types at https://api.mercadopago.com/v1/identification_types
              "number": "12345678"
          },
          "address": {
              "street_name": "Street",
              "street_number": 123,
              "zip_code": "5700"
          }
      },
      "back_urls": {
          "success": "https://www.success.com",
          "failure": "http://www.failure.com",
          "pending": "http://www.pending.com"
      },
      "auto_return": "approved",
      "payment_methods": {
          "excluded_payment_methods": [
              {
                  "id": "master"
              }
          ],
          "excluded_payment_types": [
              {
                  "id": "ticket"
              }
          ],
          "installments": 12,
          "default_payment_method_id": null,
          "default_installments": null
      },
      "shipments": {
          "receiver_address": {
              "zip_code": "5700",
              "street_number": 123,
              "street_name": "Street",
              "floor": 4,
              "apartment": "C"
          }
      },
      "notification_url": "https://www.your-site.com/ipn",
      "external_reference": "Reference_1234",
      "expires": true,
      "expiration_date_from": "2016-02-01T12:00:00.000-04:00",
      "expiration_date_to": "2016-02-28T12:00:00.000-04:00"
      }
  },

  created() {
    var mercadopago = require('mercadopago');
    /* var config = require('./../config'); */

    mercadopago.configure({
      client_id: "6882505208334284",
      client_secret: "ba4ZR4OsgJf2MjGakrrakHqVihdwoK1V",
    });


    mercadopago.preferences.create(this.preference)
    .then(function (preference) {
      // Do something if preference has been created successfully
      console.log(preference)
    }).catch(function (error) {
      // If an error has occurred
      console.log('Esto es un error', error)
    });
  }
}
</script>

<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
