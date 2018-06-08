<template>
  <div id="sample">
    <button @click="searchSample()">Search Sample</button>
    <h4 v-if="showResponse">Sample User {{sample.id}} {{sample.val}}</h4>
  </div>
</template>
<script>
import {AXIOS} from '@/components/http-common'

  export default {
    name: 'sample',

    data () {
      return {
        response: [],
        errors: [],
        sample: {
          id: '',
          val: ''
        },
        showResponse: false
      }
    },
    methods: {
      // Fetches posts when the component is created.
      searchSample () {
        AXIOS.get(`/info/` + 'suji')
          .then(response => {
            this.sample = response.data
            console.log(response.data)
            this.showResponse = true
          })
          .catch(e => {
            this.errors.push(e)
          })
      }
    }
  }
  
</script>

<style>

</style>
