const frm = document.querySelector("form");
const res = document.querySelector("h4");

frm.addEventListener("submit", (e)=>{
    const nome = frm.nome.value;
    res.textContent = `Alô, ${nome}!`;
    e.preventDefault();
})