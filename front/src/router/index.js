import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/hello/HelloWorld'
import AbuseType from '@/components/abuse/AbuseType'
import Todo from '@/components/todo/Todo'
import Sample from '@/components/sample/Sample'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/hello',
      component: HelloWorld
    },
    {
      path: '/sample/info/suji',
      component: Sample
    },
    {
      path: '/todo',
      component: Todo
    },
    {
      path: '/abuse',
      component: AbuseType
    }
  ]
})
