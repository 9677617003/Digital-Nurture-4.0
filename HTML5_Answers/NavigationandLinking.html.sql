
CREATE TABLE IF NOT EXISTS html5_exercises (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    scenario TEXT,
    objective TEXT,
    tasks TEXT
);

INSERT INTO html5_exercises (id, title, scenario, objective, tasks) VALUES
(2, 'Navigation and Linking', 'Users should navigate between "Home", "Events", and "Contact" sections.', 'Provide intuitive navigation and section-based references.', 'Use <nav> with anchor tags <a href="#events">Events</a>; Define matching IDs for each section like <section id="events">; Add a link to an external help document using <a href="help.html" target="_blank">.');
