
/**
 * MMN 13 Q1 RGBImage Represents a color image using a two-dimensional array of objects from the Department RGBColor.
 * Each point in the image is a pixel representing a single coordinate point.
 * 
 * @author (Oz Maatuk) 
 * @version (MMN 13 Q1 12/11/2014)
 */
public class RGBImage extends RGBColor
{
    // instance variables
    static private RGBColor Black = new RGBColor(0,0,0); // Black pixel for black painting :)
    private int _rows= 0; // Rows index
    private int _cols = 0; // Cols indes
    
    /**
     * RGBColor [][] _image - The _imageture are expressed in a two-dimension array of pixels (RGBColor object)
     */
    RGBColor [][] _image;
    
    /**
     * Constructors for objects of class RGBImage
     */
    /**
     * Empty constructor - make an zero on zero array of nothing.
     */
    public RGBImage()
    {
        _image = new RGBColor[0][0];
    }
    
    /**
     * Black _imageture constructor - get number of rows and cols and make a black sized _imageture
     * 
     * @param rows The number of rows in the _imageture
     * @param cols The number of cols in the _imageture
     */
    public RGBImage(int rows, int cols)
    {
        _image = new RGBColor[rows][cols];
        for(this._rows = 0; this._rows < rows; this._rows++)
        {
            for (this._cols = 0; this._cols < cols; this._cols++)
            {
                _image [this._rows][this._cols] = new RGBColor();
            }
        }
    }
    /**
     * Copy pixels constructor - get an two dimension array of pixels (RGBColor) and copy them to the _imageture.
     * 
     * @param pixels Two demintion array of pixels (RGBColor).
     */    
    public RGBImage(RGBColor[][] pixels)
    {
        _image = new RGBColor[pixels.length][pixels[0].length];
        for(this._rows=0; this._rows<pixels.length; this._rows++)
        {
            for (this._cols=0; this._cols<pixels[this._rows].length; this._cols++)
            {
                _image [this._rows][this._cols] = new RGBColor(pixels[this._rows][this._cols]);
            }
        }
    }
    
    /**
     * Copy constructor - get a RGBImage Object and copy it
     * 
     * @param other RGBColor object (_imageture).
     */  
    public RGBImage(RGBImage other)
    {
        _image = new RGBColor[other.getHeight()][other.getWidth()];
        for (this._rows=0; this._rows<other.getHeight(); this._rows++)
        {
            for (this._cols=0; this._cols<other.getWidth(); this._cols++)
            {
                _image[this._rows][this._cols] = new RGBColor(other.getPixel(this._rows,this._cols));
            }
        }
    }
    
    /**
     * int getHeight ( ) - returns the number of rows in the _imageture.
     * 
     * @return integer _image.length - number of rows in the _imageture (RGBImage object).
     */
    public int getHeight ( )
    {
        return (_image.length);
    }
    
    /**
     * int getWidth ( ) - returns the number of cols in the _imageture.
     * 
     * @return integer _image[0].length - number of cols in the _imageture (RGBImage object).
     */    
    public int getWidth ( )
    {
        return (_image[0].length);
    }
    
    /**
     * RGBColor getPixel (int row, int col) - returns the pixel (RGBColor) in the rows/cols place.
     * 
     * @param integer rows - the row number of the pixel that been asked.
     * @param integer cols - the col number of the pixel that been asked.
     * @return RGBColor object of the asked pixel.
     */    
    public RGBColor getPixel (int row, int col)
    {
        if ((row < _image.length) && (col < _image[0].length))
        {
            return _image[row][col];
        }
        else
        {
            return (Black); 
        }
        
    }
    
    /**
     * void setPixel (int row, int col, RGBColor pixel) - replace currect row/col pixel with a new one.
     * 
     * @param integer row the row number of the pixel to be replaced.
     * @param integer col the col number of the pixel to be replaced.
     * @param RGBColor object pixel the new pixel.
     */    
    public void setPixel (int row, int col, RGBColor pixel)
    {
        if ((row < _image.length) && (col < _image[0].length))
        {
            _image[row][col] = new RGBColor(pixel);
        }
    }
    
    /**
     * boolean equals (RGBImage other) - check if the _imageture is the same as the other _imageture.
     * 
     * @param RGBImage other is the other _imageture.
     * @return boolean value of true if same, and false if not.
     */    
    public boolean equals (RGBImage other)
    {
        this._rows = other.getHeight();
        this._cols = other.getWidth();
        boolean same = true;
        while ((same) && (this._rows > 0))
        {
            while ((same) && (this._cols > 0))
            {
                same = _image[this._rows - 1][this._cols - 1].equals(other.getPixel(this._rows - 1,this._cols - 1));
                this._cols--;
            }
            this._rows--;
            this._cols = other.getWidth();
        }
        return (same);
        
        
        this._rows = 0;
        this._cols = 0;
        while ((same) && (this._rows < other.getHight()))
        {
            while ((same) && (this._cols < other.getWidth())
            {
                same = _image[this._rows][this._cols].equals(other.getPixel(this._rows,this._cols));
                this._cols++;
            }
            this._rows++;
            this._cols = 0;
        }
        return same;
    }
    
    /**
     * void flipHorizontal ( ) - flip the _imageture on his horizontal axis.
     */    
    public void flipHorizontal ( )
    {
        RGBColor[] helpObj = new RGBColor[_image.length];
        
        for (this._cols = 0; this._cols < (_image[0].length/2); this._cols++)
        {
            for (this._rows = 0; this._rows < _image.length; this._rows++)
            {
                helpObj [this._rows] = new RGBColor(_image[this._rows][this._cols]);
            }
            for (this._rows = 0; this._rows < _image.length; this._rows++)
            {
                _image[this._rows][this._cols] = new RGBColor(_image[this._rows][_image[0].length - this._cols -1]);
            }
            for (this._rows = 0; this._rows < _image.length; this._rows++)
            {
                _image[this._rows][_image[0].length - this._cols -1] = new RGBColor(helpObj [this._rows]);
            }
        }
    }
    
    /**
     * void flipVertical ( ) - flip the _imageture on his vertical axis. 
     */    
    public void flipVertical ( )
    {
        RGBColor[] helpObj = new RGBColor[_image[0].length];

        for (this._rows = 0; this._rows < (_image.length/2); this._rows++)
        {
            for (this._cols = 0; this._cols < _image[0].length; this._cols++)
            {
                helpObj [this._cols] = new RGBColor(_image[this._rows][this._cols]);
            }
            for (this._cols = 0; this._cols < _image[0].length; this._cols++)
            {
                _image[this._rows][this._cols] = new RGBColor(_image[_image.length - this._rows -1][this._cols]);
            }
            for (this._cols = 0; this._cols < _image[0].length; this._cols++)
            {
                _image[_image.length - this._rows -1][this._cols] = new RGBColor(helpObj [this._cols]);
            }
        }
    }
    
    /**
     * void invertColors( ) - invert the colors of the _imageture, pixel by pixel.
     */    
    public void invertColors( )
    {
        for (this._rows=0; this._rows<_image.length; this._rows++)
        {
            for (this._cols=0; this._cols<_image[0].length; this._cols++)
            {
                _image[this._rows][this._cols].invert();
            }
        }
    }
    
    /**
     * void rotateClockwise ( ) - rotate the _imageture clockwise.
     */ 
    public void rotateClockwise ( )
    {
        RGBColor [][] helpObj = new RGBColor[_image[0].length][_image.length]; // used to help us paint our change in a new picture, and them replace the old one.

        for (this._rows = 0; this._rows < _image.length; this._rows++)
        {
            for (this._cols = 0; this._cols < _image[0].length; this._cols++)
            {
                helpObj [this._cols][_image.length - this._rows -1] = new RGBColor(_image[this._rows][this._cols]);
            }
        }
        
        _image = helpObj;
        helpObj = null;
    }
    
    /**
     * void rotateCounterClockwise ( ) - rotate the _imageture counterclockwise.
     */    
    public void rotateCounterClockwise ( )
    {
        RGBColor [][] helpObj = new RGBColor[_image[0].length][_image.length]; // used to help us paint our change in a new picture, and them replace the old one.
        
        for (this._rows=0; this._rows<_image.length; this._rows++)
        {
            for (this._cols=0; this._cols<_image[0].length; this._cols++)
            {
                helpObj [_image[0].length - this._cols -1][this._rows] = new RGBColor(_image[this._rows][this._cols]);
            }
        }
        _image = helpObj;
        helpObj = null;        
    }
    
    /**
     * void shiftCol (int offset) - move the _imageture offset cols to the right, paint black the cols that been moved. 
     * 
     * @param  integer offset - the nuber of cols to move the _imageture.
     */    
    public void shiftCol (int offset)
    {
        RGBColor [][] helpObj = new RGBColor[_image.length][_image[0].length]; // used to help us paint our change in a new picture, and them replace the old one.
        if (offset == (_image[0].length) || (offset * (-1)) == (_image[0].length))
        {
            for(this._rows = 0; this._rows < _image.length; this._rows++)
            {
                for (this._cols = 0; this._cols < _image[0].length; this._cols++)
                {
                    helpObj [this._rows][this._cols] = new RGBColor(Black);
                }
            }
        }
        
        else if (offset < (_image[0].length) && (offset > 0))
        {    
            for (this._cols = offset; this._cols < (_image[0].length); this._cols++)
            {
                for (this._rows = 0; this._rows < _image.length; this._rows++)
                {
                    helpObj[this._rows][this._cols] = new RGBColor(_image[this._rows][this._cols - offset]);
                }
            }
            for (this._cols = 0; this._cols < offset; this._cols++)
            {
                for (this._rows = 0; this._rows < _image.length; this._rows++)
                {
                    helpObj[this._rows][this._cols] = new RGBColor(Black);
                }
            }
        }
        else if ((offset * (-1)) < (_image[0].length) && (offset < 0))
        {
            offset = offset * (-1);
            for (this._cols = (_image[0].length - offset -1); this._cols >= 0; this._cols--)
            {
                for (this._rows = 0; this._rows < _image.length; this._rows++)
                {
                    helpObj[this._rows][this._cols] = new RGBColor(_image[this._rows][this._cols + offset]);
                }
            }
            for (this._cols = _image[0].length -1; this._cols > (_image[0].length - offset -1); this._cols--)
            {
                for (this._rows = 0; this._rows < _image.length; this._rows++)
                {
                    helpObj[this._rows][this._cols] = new RGBColor(Black);
                }
            }
        }
        
        _image = helpObj;
        helpObj = null;
    }
    
    /**
     * void shiftRows (int offset) - move the _imageture offset rows down, paint black the rows that been moved. 
     * 
     * @param  integer offset - the nuber of rows to move the _imageture.
     */   
    public void shiftRow (int offset)
    {
        RGBColor [][] helpObj = new RGBColor[_image.length][_image[0].length]; // used to help us paint our change in a new picture, and them replace the old one.
        if (offset == (_image.length) || (offset * (-1)) == (_image.length))
        {
            for(this._rows = 0; this._rows < _image.length; this._rows++)
            {
                for (this._cols = 0; this._cols < _image[0].length; this._cols++)
                {
                    helpObj [this._rows][this._cols] = new RGBColor(Black);
                }
            }
        }
        
        else if ((offset < _image.length) && (offset > 0))
        {   
            for (this._rows = offset; this._rows < (_image.length); this._rows++)
            {
                for (this._cols = 0; this._cols < _image[0].length; this._cols++)
                {
                    helpObj[this._rows][this._cols] = new RGBColor(_image[this._rows - offset][this._cols]);
                }
            }
            for (this._rows = 0; this._rows < offset; this._rows++)
            {
                for (this._cols = 0; this._cols < _image[0].length; this._cols++)
                {
                    helpObj[this._rows][this._cols] = new RGBColor(Black);
                }
            }
        }
        
        else if(((offset * (-1)) < _image.length) && (offset < 0))
        {
            offset = offset * (-1);
            for (this._rows = (_image.length - offset -1); this._rows >= 0; this._rows--)
            {
                for (this._cols = 0; this._cols < _image[0].length; this._cols++)
                {
                    helpObj[this._rows][this._cols] = new RGBColor(_image[this._rows + offset][this._cols]);
                }
            }
            for (this._rows = _image.length -1; this._rows > (_image.length - offset -1); this._rows--)
            {
                for (this._cols = 0; this._cols < _image[0].length; this._cols++)
                {
                    helpObj[this._rows][this._cols] = new RGBColor(Black);
                }
            }           
        }
        _image = helpObj;
        helpObj = null;        
    }
    
    /**
     * double[][] toGrayscaleArray ( ) - change _imageture color to grayscale.
     */    
    public double[][] toGrayscaleArray ( )
    {
        double [][] grayscaleArray = new double[_image.length][_image[0].length]; //the array we creat to return.
        for (this._rows=0; this._rows<_image.length; this._rows++)
        {
            for (this._cols=0; this._cols<_image[0].length; this._cols++)
            {
                grayscaleArray[this._rows][this._cols] = _image[this._rows][this._cols].convertToGrayscale();
            }
        }
        return grayscaleArray;
    }
    
    /**
     * String toString() - prints the pivture pixels by string in (red, green, blue) format.
     * 
     * @return a table of the pixels colors.
     */    
    public String toString()
    {
        String stringToReturn = new String(); //the string we creat to return.
        for (this._rows=0; this._rows<_image.length; this._rows++)
        {
            for (this._cols=0; this._cols<_image[0].length; this._cols++)
            {
                stringToReturn = stringToReturn + _image[this._rows][this._cols].toString() + " ";
            }
            stringToReturn = stringToReturn + "\n";
        }
        return stringToReturn;
    }
    
    /**
     * toRGBColorArray() - Convert a _imageture (RGBImage) to a two demintion array of pixels (RGBColor).
     * 
     * @return RGBColor[][] two demintion array of RGBColor (pixels)
     */    
    public RGBColor[][] toRGBColorArray()
    {
        RGBColor[][] copy_image = new RGBColor[_image.length][_image[0].length]; // the array we creat to return.
        for (this._rows=0; this._rows<_image.length; this._rows++)
        {
            for (this._cols=0; this._cols<_image[0].length; this._cols++)
            {
                copy_image[this._rows][this._cols] = new RGBColor(_image[this._rows][this._cols]);
            }
        }
        return copy_image;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}
