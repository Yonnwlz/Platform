//初始化组件
Vue.component('paginate', VuejsPaginate);

var mage = new Vue({
    el:'#magPage',         //作用域
    data:{
        url:"getAdminAll",
        pageCount:0,
        isShowState:false,
        isShowRole:false,
        searchResult:{},
        searchResultDesc:{
            admin:[],
            rolerela:{
                role:[]
            }
        },
        onw:null,
        searchParam:{
            adminId:11,
            pageNum:1,
            pageSize:2,
            adminName:'',
            adminstate:'',
            adminaddress:'',
            roleName:'',
        },
        leftMenu:[],
        admin:{
            adminaccount:'',
            adminpassword:''
        },
        mienotId:0,
        id:null,
    },
    created:function () {       //构造方法
        this.getAllAdmin()
    },
    methods:{       //方法
        //所有管理员
        getAllAdmin : function () {
            var selt = this;
            axios.get(selt.url,{params:selt.searchParam}).then(function (ras) {
                selt.searchResult=ras.data;
                selt.pageCount=Math.ceil(ras.data.total/selt.searchParam.pageSize);
            })
        },
        //修改基本信息
        updateAdminModify : function (parameter) {
            if(parameter!=null){
                this.searchResultDesc.admin.adminid=parameter;
                axios.put("/AdministratorModification",this.searchResultDesc.admin).then(function (ras) {
                    if(ras.data){
                        alert("基本信息修改成功！");
                    }else {
                        alert("基本信息修改失败！");
                    }
                })
            }else {
                //解除文本框不可编辑
                var tags = document.getElementsByClassName("remverDisabled");
                for(var i=0;i < tags.length; i++)
                {
                    tags[i].removeAttribute('disabled');
                }
            }

        },
        //修改管理员状态
        updateAdminState : function(parameter){
            if(parameter!=null){
                var selt = this;
                this.searchResultDesc.admin.adminid=parameter;
                axios.put("/AdministratorModification",this.searchResultDesc.admin).then(function (ras) {
                    if(ras.data){
                        alert("状态修改成功！");
                    }else {
                        alert("状态修改失败！");
                    }
                })
            }else {
                this.isShowState = !this.isShowState;
            }
        },
        //管理员角色修改
        updateAdminRole : function(parameter){
            var selt = this;
            if(parameter!=null){
                this.searchResultDesc.admin.adminid=parameter;
                axios.put("/theRoleChange",this.searchResultDesc.rolerela).then(function (ras) {
                    if(ras.data){
                        alert("状态修改成功！");
                        selt.isShowRole = false;
                    }else {
                        alert("状态修改失败！");
                    }
                })
            }else {
                this.isShowRole = !this.isShowRole;
            }
        },
        //详情
        getadminDesc : function (parameter) {
            var selt = this;
            axios.get("/getAdmiDetails/"+parameter).then(function (ras) {
                console.log(ras.data);
                selt.onw=ras.data.admin.adminname;
                selt.searchResultDesc = ras.data;
            })
        },
        descCloud : function () {
            alert("关闭");
        }
    }
})