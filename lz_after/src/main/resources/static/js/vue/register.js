var registervue = new Vue({
    el:'#indePage',         //作用域
    data:{
        roles:{},
        admin:{

        },
        selected:'请选择管理员权限'     //选中的角色
    },
    created:function () {       //构造方法
        this.getAllRoles()
    },
    methods:{       //方法
        //获取所有角色
        getAllRoles:function(){
            var current = this;
            axios.get("/getAllRoles",).then(function (ras) {
                current.roles = ras.data;
            })
        },
        //新增管理员+添加角色
        submitRegiste:function (event) {
            var current = this;
            console.log(current.admin);
            this.admin.adminid=this.selected;
            //新增管理员
            axios.post("/AddAdmin",this.admin).then(function (ras) {
                console.log(ras.data)
                if(ras.data){
                    alert("管理员创建成功！")
                    location.href = 'register'
                }
            })
        }
    }
})