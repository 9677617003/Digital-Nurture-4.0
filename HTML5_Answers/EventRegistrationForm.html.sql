
CREATE TABLE IF NOT EXISTS html5_exercises (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    scenario TEXT,
    objective TEXT,
    tasks TEXT
);

INSERT INTO html5_exercises (id, title, scenario, objective, tasks) VALUES
(5, 'Event Registration Form', 'Residents need to register for events.', 'Practice input types, validation, placeholder, autofocus, and output.', 'Include fields: name (text), email (email), date (date), event type (select), message (textarea); Add placeholder, required, and autofocus; Display a confirmation message using <output> when the form is submitted; Style the form using CSS.');
