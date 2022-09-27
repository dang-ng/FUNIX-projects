const regex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

const info = document.querySelector('.info');
const form = document.querySelector('.form-info');


document.querySelector('.submit').addEventListener('click', function () {
    let email = document.querySelector('#inputEmail').value;
    if (regex.test(email)) {
        info.classList.remove('d-none');
        form.classList.add('d-none');
    }
})


