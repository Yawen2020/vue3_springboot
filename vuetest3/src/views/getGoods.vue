<template>
  <div>
    <table border="1"
           bgcolor="61EA3BF7" cellspacing="6">
      <tr>
        <th><span style="color: rgba(234,59,80,0.97)">序号</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">货品编号</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">所属供应商编号</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">货品名称</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">货品类型</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">货品尺寸</span></th>
        <th><span style="color: rgba(234,59,80,0.97)">货品价格</span></th>
      </tr>
      <tr v-for="(item,index) in goods">
        <td>{{index+1}}</td>
        <td>{{item.good_ID}}</td>
        <td>{{item.supplier_ID}}</td>
        <td>{{item.good_NAME}}</td>
        <td>{{item.good_RYPE}}</td>
        <td>{{item.good_SIZE}}</td>
        <td>{{item.good_VALUE}}</td>
      </tr>
    </table>

  </div>
</template>

<script>
import axios from "axios"
export default {
  name: "getGoods",
  data(){
    return {
      goods:[]
    }
  },
  created() {
    const _this = this
    axios.get('http://localhost:8181/supplier/getGoods').then(function (res){
      console.log(res.data)
      _this.goods = res.data
    })
  }
}
</script>

<style scoped>
</style>
