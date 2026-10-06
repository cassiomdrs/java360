const frm = document.querySelector("form");
const res = document.querySelector("h4");

frm.addEventListener("submit", (e)=>{
    const filme = frm.filme.value;
    const tempo = frm.tempo.value;
    const tempoHora = Math.floor(Number(tempo) / 60);
    const minutos = Number(tempo) % 60;
    alert(`Seu filme preferido é: ${filme}!\nO filme tem: ${tempoHora} Hora(s) e ${minutos} Minuto(s) de duração.`);
    e.preventDefault();
})