<template>
  <div class="from_box">
    <form action="">
      <input type="text"  placeholder="请输入供应商编号" v-model="formMess.id">
    </form>
    <span class="but" @click="onSubmit()">删除</span>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: "deleteById",
  data() {
    return {
      formMess:{
        "id":""
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
        url:'http://localhost:8181/supplier/deleteById',
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