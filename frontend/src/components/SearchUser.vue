<template>
  <v-container>
    <v-layout text-center wrap>
      <v-flex mb-4>
        <br />
        <h1 class="display-2 font-weight-bold mb-3">ค้นหาข้อมูล USER</h1>
      </v-flex>
    </v-layout>
    <v-row justify="center">
      <v-col cols="12">
        <v-row justify="center">
          <v-col cols="12" sm="6">
            <v-text-field
              label="ค้นหาด้วย USER ID"
              v-model="userID"
              append-icon="search"
              outlined
              :rules="[(v) => !!v || 'กรุณากรอก USER ID']"
            ></v-text-field>
          </v-col>
        </v-row>
        <div class="text-center">
          <div>
            <v-btn large color="primary" dark @click="getUser">ค้นหาข้อมูล</v-btn>
          </div>
        </div>
      </v-col>
    </v-row>
    <div v-if="table">
      <v-row justify="center">
        <v-col cols="12" sm="8">
          <v-data-table hide-default-footer :headers="headers" :items="desserts"></v-data-table>
        </v-col>
      </v-row>
    </div>
  </v-container>
</template>

<script>
import http from "../api";

export default {
  name: "SearchUser",
  data() {
    return {
      headers: [
        {
          text: "รหัสประจำตัว",
          align: "left",
          sortable: false,
          value: "userId"
        },
        { text: "ชื่อ", value: "firstName" },
        { text: "นามสกุล", value: "lastName" },
        { text: "อายุ", value: "age" },
        { text: "ที่อยู่", value: "address" }
      ],
      desserts: [],
      userID: "",
      table: false
    };
  },

  methods: {
    /* eslint-disable no-console */
    getUser() {
      if (this.userID == "") {
        alert("กรุณากรอกข้อมูล");
      } else {
        http
          .get("/user/" + this.userID)
          .then(response => {
            this.dessert = response.data;
            if (this.dessert == "") {
              alert("ไม่พบข้อมูล");
              console.log("ไม่พบข้อมูล");
            } else {
              this.desserts = response.data;
              console.log(this.desserts);
              this.table = true;
            }
          })
          .catch(e => {
            console.log(e);
          });
      }
    }
    /* eslint-disable no-console */
  },
  mounted() {}
};
</script>