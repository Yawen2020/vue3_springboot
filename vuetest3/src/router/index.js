import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Test from '../views/Test'
import add from "../views/add";
import deleteById from "../views/deleteById";
import getGoods from "../views/getGoods";

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/test',
    name: 'Test',
    component: Test
  },
  {
    path: '/add',
    name: 'Add',
    component: add
  },
  {
    path: '/deleteById',
    name: 'deleteById',
    component: deleteById
  },
  {
    path: '/getGoods',
    name: 'getGoods',
    component: getGoods
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
