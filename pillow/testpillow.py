import os
from PIL import Image, ImageDraw, ImageFont

# Draw dummy image
img = Image.new('RGB', (800, 100), color = (73, 109, 137))
d = ImageDraw.Draw(img)

# Load font list
fontfile = 'NotoSansTibetan-Regular.ttf'
fonts_path = os.path.join(os.path.dirname(os.path.dirname(__file__)), 'fonts')

# Print font name and tests
y = 10
fnt = ImageFont.truetype(fontfile, 24)
d.text((10, y), "༄༅། །སྒྲུབ།", font=fnt, fill=(255, 255, 0))
y +=  50

fnt = ImageFont.truetype(fontfile, 24, layout_engine=ImageFont.LAYOUT_RAQM)
d.text((10, y), "༄༅། །སྒྲུབ།", font=fnt, fill=(255, 255, 0))
y +=  50

img.save('result.png')
