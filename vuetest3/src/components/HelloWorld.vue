<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h3>供应商信息列表查询</h3>
    <ul>
      <router-link to="/test">供应商信息查询</router-link>
    </ul>
    <h3>供应商信息管理</h3>
    <ul>
      <router-link to="/add">添加供应商信息</router-link>  --------------
      <router-link to="/deleteById">删除供应商信息</router-link>
    </ul>
    <h3>提供的货品信息查询</h3>
    <ul>
      <router-link to="/getGoods">货品信息查询</router-link>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
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
