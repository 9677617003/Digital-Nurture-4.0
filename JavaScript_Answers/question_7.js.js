const container = document.querySelector("#events");
const event = { name: "Festival", category: "Culture" };

const card = document.createElement("div");
card.textContent = event.name;
container.appendChild(card);