import os
from PIL import Image, ImageDraw, ImageFont

# Draw dummy image
img = Image.new('RGB', (800, 300), color = (73, 109, 137))
d = ImageDraw.Draw(img)

# Load font list
fontfile = 'NotoSansTibetan-Regular.ttf'

# simple layout engine:
y = 10
fnt = ImageFont.truetype(fontfile, 24)
d.text((10, y), "༄༅། །སྒྲུབ།", font=fnt, fill=(255, 255, 0))
y +=  50

# with libraqm
fnt = ImageFont.truetype(fontfile, 24, layout_engine=ImageFont.LAYOUT_RAQM)
d.text((10, y), "༄༅། །སྒྲུབ།", font=fnt, fill=(255, 255, 0))
y +=  50

# using opentype features:
# list from https://docs.microsoft.com/en-us/typography/script-development/tibetan
fnt = ImageFont.truetype('NotoSansTibetan-Regular.ttf', 24, layout_engine=ImageFont.LAYOUT_RAQM)
res = fnt.getmask("༄༅། །སྒྲུབ།", features=['ccmp', 'abvs', 'blws', 'calt', 'liga', 'kern', 'abvm', 'blwm', 'mkmk'])

img.save('result.png')
