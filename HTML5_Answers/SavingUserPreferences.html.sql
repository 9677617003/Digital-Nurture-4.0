
CREATE TABLE IF NOT EXISTS html5_exercises (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    scenario TEXT,
    objective TEXT,
    tasks TEXT
);

INSERT INTO html5_exercises (id, title, scenario, objective, tasks) VALUES
(8, 'Saving User Preferences', 'Store preferred event type for returning users.', 'Work with localStorage, sessionStorage, and deletion.', 'Save selected event type in localStorage; On reload, retrieve and pre-select it; Add a "Clear Preferences" button that clears both localStorage and sessionStorage.');
