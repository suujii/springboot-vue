<template>
  <div id="#app">
    {{sample.id}}
    {{sample.val}}
  </div>
</template>

<script>
  import {AXIOS} from './http-common'

  export default {
    el : "#app",
    data : {
      response : [],
      sample : {
        id : '',
        val : ''
      },
    }
    methods: {
      getData: function(){
        axios.get('/user/suji')
        .then(function(response){
          this.response = response.data
          this.sample.id = response.data.id
          this.sample.val = response.data.val
        });
      }
    }<template>
  <div id="#app">
    {{sample.id}}
    {{sample.val}}
  </div>
</template>

<script>
  import {AXIOS} from './http-common'

  export default {
    el : "#app",
    data : {
      response : [],
      errors : [],
      sample : {
        id : '',
        val : ''
      },
    }
    methods: {
      getData: function(){
        axios.get('/user/suji')
        .then(function(response){
          this.response = response.data
          this.sample.id = response.data.id
          this.sample.val = response.data.val
        }).catch(e => {
          this.errors.push(e)
        });
      }
    }
  }
</script>

<style>
#app {
  font-style: italic
}
</style>
    
  }
</script>

<style>
#app {
  font-style: italic;
}
</style>
