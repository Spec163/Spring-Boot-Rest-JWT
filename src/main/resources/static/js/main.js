
Vue.component('todo-item', {
    template: '<li>Это одна задача в списке</li>'
})

var app = new Vue(...)

var app = new Vue({
    el: '#app',
    data: {
        message: 'User!'
    }
})

var app2 = new Vue({
    el: '#app-2',
    data: {
        message: 'Вы загрузили эту страницу: ' + new Date().toLocaleString()
    }
})