var v = new Vue({
    el:'#indePage',         //作用域
    data:{
        leftMenu:[],
        admin:{

        },
        mienotId:0
    },
    created:function () {       //构造方法
        console.log(this.admin);
        this.findMenuAll();
    },
    methods:{       //方法
        //左侧菜单显示
        findMenuAll:function() {
            //获取cookie用户信息
            var adminUser = JSON.parse(localStorage.getItem("admin"))
            this.admin=adminUser;
            //获取cookie用户权限
            var adminId = localStorage.getItem("adminId");

            var current = this;
            axios.get('/VimRole'+"/"+adminId,{
            }).then(function (res) {
                current.leftMenu = res.data;
            }).catch(function (error) {
                console.log(error);
            })
        }
    }
})