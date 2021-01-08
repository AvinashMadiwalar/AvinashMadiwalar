module.exports = {
	// General
	useTabs: true, // use tabs instead of spaces
	tabWidth: 2, // Width of tabs
	semi: true, // have semicolons at the end of statements
	singleQuote: true, // use singe quotes instead of double quotes
	quoteProps: 'as-needed', // add quotes for properties where requireed
	trailingComma: 'es5', // add trailing commas for es5 objects
	bracketSpacing: true, // add spaces between {} ==> { foo: bar }
	arrowParens: 'always', //add  brackets around params in fat arrow function "(x) => {...}"
	htmlWhitespaceSensitivity: 'strict', // whitespaces in inline elements (span) are preserved
	endOfLine: 'auto', // Line feed ends are preserved as is

	// Markdown
	printWidth: 120,
	proseWrap: 'preserve',

	// File type specific overrides
	overrides: [
		{
			// Typescript files
			files: '*.ts',
			options: {},
		},
		{
			// HTML files
			files: '*.html',
			options: {},
		},
		{
			// SCSS files
			files: '*.scss',
			options: {},
		},
		{
			// CSS files
			files: '*.css',
			options: {},
		},
		{
			// JSON files
			files: '*.json',
			options: {},
		},
		{
			// Markdown files
			files: '*.md',
			options: {},
		},
		{
			// JavaScript files
			files: '*.js',
			options: {},
		},
	],
};
