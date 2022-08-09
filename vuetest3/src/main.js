import './plugins/axios'
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

import axios from 'axios'
import VueAxios from 'vue-cli-plugin-axios'

createApp(App).use(VueAxios, axios)



createApp(App).use(store).use(router).mount('#app')
