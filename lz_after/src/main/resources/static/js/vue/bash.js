var v = new Vue({
    el:'#indePage',         //作用域
    data:{
        leftMenu:[],
        admin:{
            adminaccount:'',
            adminpassword:''
        },
        mienotId:0
    },
    created:function () {       //构造方法

    },
    methods:{       //方法\
        //登录验证
        getLogin:function(){
            var current = this;
            axios.get("/loginShiro",{params: this.admin}).then(function (ras) {
                if(ras.data.msg=='1'){
                    alert("登录成功！")
                    //存入cookie
                    localStorage.setItem("adminId",ras.data.adminId);
                    localStorage.setItem("admin",JSON.stringify(ras.data.loginValidation));
                    location.href = "/index";
                }else if(ras.data.msg=='2'){
                    alert("用户名不存在!")
                }else {
                    alert("密码错误!")
                }
            })
        },
    }
})