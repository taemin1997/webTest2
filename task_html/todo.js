// NodeList.prototype.filter = Array.prototype.filter;
// 버튼 선택
const toBtn = document.querySelector("#task-btn");
// 빈 div 선택
const taskDiv = document.querySelector('#task-items');



function makeTasks(){
  const newDiv =  document.createElement('div');
  task = prompt("할 일 : ");
  if(task != null){
    // console.log(task);
    newDiv.style.width = "400px";
    newDiv.style.display = "flex";
    newDiv.style.justifyContent = "space-between";
    newDiv.style.height = "20px";
    // newDiv.style.lineHeight = "20px";
    newDiv.style.marginBottom = "20px";
    newDiv.innerHTML = `<span><input type="checkbox" class = "task-check">
    ${task}</span> <button type = "button" class = "removeBtn" style="height: 22px;">삭제</button>`;
    taskDiv.appendChild(newDiv);
    newDiv.style.marginTop = "10px";

    const remover = document.querySelectorAll('.removeBtn');
    const checker = document.querySelectorAll('.task-check');

    
    // console.log(remover);
    remover.forEach((btn) => {
      btn.addEventListener('click', () =>{
        let remove = confirm("삭제 하시겠습니까?");
        if(remove){
          btn.parentElement.remove(newDiv);
        }
      })
    });
    
    // console.log(checker);
    checker.forEach((checkers) => {
      checkers.addEventListener('click', (e) =>{
        if(e.target.checked){
          console.log(e.target);
          e.target.parentElement.parentElement.style.backgroundColor = "skyBlue";
        }else{
          e.target.parentElement.parentElement.style.backgroundColor = "white";
        }
      })
    });
  }
}

toBtn.addEventListener('click', makeTasks);


// console.log(taskDiv);



// console.log(toBtn);
// toBtn.addEventListener('click', () => {
//   text = prompt("할일 : ");
//   console.log(text);
//   newDiv.innerText = text;
//   taskDiv.appendChild(newDiv);
//   newDiv.style.marginTop = "10px";
// });