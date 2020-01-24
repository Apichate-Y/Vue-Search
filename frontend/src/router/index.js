import Vue from "vue";
import VueRouter from "vue-router";
import SearchUser from "../components/SearchUser.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "SearchUser",
    component: SearchUser
  }
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes
});

export default router;
