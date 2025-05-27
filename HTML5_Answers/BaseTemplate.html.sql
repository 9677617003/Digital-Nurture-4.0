
CREATE TABLE IF NOT EXISTS html5_exercises (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    scenario TEXT,
    objective TEXT,
    tasks TEXT
);

INSERT INTO html5_exercises (id, title, scenario, objective, tasks) VALUES
(1, 'Create the HTML5 Base Template', 'You’re setting up the base document that every page on the portal will use.', 'Ensure semantic structure and compatibility across browsers.', 'Use <!DOCTYPE html>, <html lang="en">, <meta charset="UTF-8">; Add comments to label sections like "Navigation", "Main", "Footer"; Save as index.html and open it in Chrome; Inspect the document structure in Chrome Dev Tools.');
