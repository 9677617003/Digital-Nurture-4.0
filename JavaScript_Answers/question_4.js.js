function addEvent(name, category) {
    return { name, category, seats: 10 };
}

function registerUser(event) {
    event.seats--;
    return event;
}

function filterEventsByCategory(events, category) {
    return events.filter(e => e.category === category);
}

function categoryCounter() {
    let count = 0;
    return function() {
        count++;
        return count;
    };
}

const countMusic = categoryCounter();