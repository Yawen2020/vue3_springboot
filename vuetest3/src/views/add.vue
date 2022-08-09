<template>
  <div class="from_box">
    <form action="">
      <input type="text"  placeholder="请输入供应商名称" v-model="formMess.name">
      <input type="text" placeholder="请输入负责人" v-model="formMess.person">
      <input type="text" placeholder="请输入联系电话" v-model="formMess.tel">
      <input type="text" placeholder="请输入电子邮件" v-model="formMess.email">
      <input type="text" placeholder="请输入详细地址" v-model="formMess.address">
    </form>
    <span class="but" @click="onSubmit()">提交</span>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: "from",
  data() {
    return {
      formMess:{
        "name":"",
        "person":"",
        "tel":"",
        "email":"",
        "address":""
      }
    };
  },
  methods: {
    onSubmit() {
      /* json格式提交： */
      // let formData = JSON.stringify(this.formMess);

      /* formData格式提交： */
      let formData = new FormData();
      for(var key in this.formMess){
        formData.append(key,this.formMess[key]);
      }

      axios({
        method:"post",
        url:'http://localhost:8181/supplier/add',
        headers: {
          "Content-Type": "multipart/form-data"
        },
        withCredentials:true,
        data:formData
      }).then((res)=>{
        console.log(res);
      });
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="less">
.from_box{
  form{
    width:60%;
    margin: auto;
    border:.01rem solid gray;
    display: flex;
    flex-wrap: wrap;
    input{
      width:90%;
      height:.9rem;
      margin-bottom: .4rem;
      border:.01rem solid black;
      height:.9rem;
    }
  }
  .but{
    font-size: .10rem;
    margin-left:5%;
  }
}
</style>