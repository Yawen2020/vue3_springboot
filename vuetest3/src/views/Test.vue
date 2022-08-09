<template>
  <div>
    <table border="1"
           bgcolor="5ACEA2F7" cellspacing="6">
      <tr>
        <th><span style="color: rgba(234,59,80,0.97)">序号</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">供应商编号</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">供应商名称</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">负责人</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">联系电话</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">电子邮箱</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">详细地址</span></th>
      </tr>
      <tr v-for="(item,index) in tests">
        <td>{{index+1}}</td>
        <td>{{item.supplierId}}</td>
        <td>{{item.name}}</td>
        <td>{{item.personInCharge}}</td>
        <td>{{item.tel}}</td>
        <td>{{item.email}}</td>
        <td>{{item.address}}</td>
      </tr>
    </table>

  </div>
</template>

<script>
import axios from "axios"
export default {
  name: "Test",
  data(){
    return {
      tests:[]
    }
  },
  created() {
    const _this = this
    axios.get('http://localhost:8181/supplier/findAll').then(function (res){
      console.log(res.data)
      _this.tests = res.data
    })
  }
}
</script>

<style scoped>
</style>
