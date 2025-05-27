const events = [];
events.push({ name: "Music Show", category: "Music" });

const musicEvents = events.filter(e => e.category === "Music");

const formatted = events.map(e => `Event: ${e.name}`);
console.log(formatted);