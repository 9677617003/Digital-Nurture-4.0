
CREATE TABLE IF NOT EXISTS html5_exercises (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    scenario TEXT,
    objective TEXT,
    tasks TEXT
);

INSERT INTO html5_exercises (id, title, scenario, objective, tasks) VALUES
(4, 'Image Gallery for Community Events', 'Show images from past events in a table layout.', 'Work with <img>, tables, and formatting tags.', 'Use a <table> with 2 rows and 3 columns of <img> tags; Include alt, title, and style each image with borders using a class; Add a caption to describe each event.');
