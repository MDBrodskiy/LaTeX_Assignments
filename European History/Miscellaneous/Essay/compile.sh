#!/bin/bash
 
# Create directory if it doesn't exist
if [ ! -d "output" ]; then
  mkdir output
fi
 
# Run pdflatex and biber with metafiles as in-/output directories
pdflatex -output-directory=output "Essay" 
biber --input-directory=output --output-directory=output "Essay"
pdflatex -output-directory=output "Essay"
pdflatex -output-directory=output "Essay"
makeglossaries -d output "Essay"
pdflatex -output-directory=output "Essay"
 
# Create a softlink to the output PDF
ln -s output/"Essay.pdf"

