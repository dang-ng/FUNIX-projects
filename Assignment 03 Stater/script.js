const regex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

const info = document.querySelector('.info');
const form = document.querySelector('.form-info');
const viewmore = document.querySelectorAll('.viewmore');
const ijob = document.querySelectorAll('.i-job');
const divjob = document.querySelectorAll('.div-job');
const invalid = document.querySelector('.invalid');

document.querySelector('.submit').addEventListener('click', function () {
    let email = document.querySelector('#inputEmail').value;
    if (regex.test(email)) {
        info.classList.remove('d-none');
        form.classList.add('d-none');
        invalid.classList.add('d-none');
    } else invalid.classList.remove('d-none');
})

for (let i = 0; i < divjob.length; i++){
    divjob[i].addEventListener('mouseover', function () {
        viewmore[i].classList.remove('d-none');
    })
}
for (let i = 0; i < divjob.length; i++) {
    divjob[i].addEventListener('mouseout', function () {
        viewmore[i].classList.add('d-none');
    })
}


for (let i = 0; i < viewmore.length;i++){
viewmore[i].addEventListener('click', function () {
    ijob[i].classList.toggle('d-none');
    viewmore[i].innerHTML == '<i class="bi bi-caret-down-fill"></i>  VIEW MORE' ? viewmore[i].innerHTML = '<i class="bi bi-caret-down-fill"></i>  VIEW LESS' : viewmore[i].innerHTML = '<i class="bi bi-caret-down-fill"></i>  VIEW MORE';

})
}


