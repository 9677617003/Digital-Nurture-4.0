
CREATE TABLE IF NOT EXISTS html5_exercises (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    scenario TEXT,
    objective TEXT,
    tasks TEXT
);

INSERT INTO html5_exercises (id, title, scenario, objective, tasks) VALUES
(10, 'Debugging with Chrome DevTools', 'A few users report layout issues and script errors.', 'Use Chrome DevTools and VS Code features to debug.', 'Use “Inspect Element” to modify styles and experiment live; Use the Console tab to view logs from your <script>; Add breakpoints in JS and reload the page to watch variable values.');
