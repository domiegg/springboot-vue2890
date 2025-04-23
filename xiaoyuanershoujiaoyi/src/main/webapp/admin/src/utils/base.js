const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyuanershoujiaoyi/",
            name: "xiaoyuanershoujiaoyi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyuanershoujiaoyi/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园二手交易平台"
        } 
    }
}
export default base
