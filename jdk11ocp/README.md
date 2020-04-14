### some useful ebooks

1. OCP study guide from wiley.com, you want to remove watermark from some ebooks. How to?

```
#install pdftk
#export LC_CTYPE=C # if you encounter "sed: RE error: illegal byte sequence"
pdftk original.pdf output uncompressed.pdf uncompress
sed -e "s/Download from Wow! eBook \<www.wowebook.com\>/ /g" < uncompressed.pdf > temp.pdf
pdftk temp.pdf output fixed.pdf compress
rm temp.pdf

```

2. OCP study
