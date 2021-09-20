/* The following code was generated by JFlex 1.4.3 on 20/09/21 05:15 PM */

package AnalizadorLex;
import static AnalizadorLex.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 20/09/21 05:15 PM from the specification file
 * <tt>src/AnalizadorLex/Lexico.flex</tt>
 */
class Lexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\25\2\0\1\3\22\0\1\3\1\44\1\26\2\0"+
    "\1\47\1\42\1\0\1\50\1\51\1\41\1\37\1\57\1\40\1\56"+
    "\1\24\12\2\1\61\1\60\1\46\1\36\1\45\2\0\22\1\1\30"+
    "\7\1\1\54\1\0\1\55\1\0\1\1\1\0\1\17\1\12\1\15"+
    "\1\7\1\14\1\21\1\23\1\16\1\4\1\1\1\35\1\13\1\32"+
    "\1\5\1\10\1\31\1\1\1\20\1\22\1\6\1\11\1\1\1\34"+
    "\1\33\1\27\1\1\1\52\1\43\1\53\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\14\2\1\5\1\6"+
    "\1\7\4\2\1\10\1\11\1\12\1\13\3\14\2\15"+
    "\1\1\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\2\1\30\2\2\1\31\25\2"+
    "\1\4\1\32\4\2\1\15\1\33\1\14\1\0\1\34"+
    "\14\2\1\35\6\2\1\36\13\2\1\0\1\37\6\2"+
    "\1\40\1\41\1\42\1\43\3\2\1\44\1\45\1\46"+
    "\7\2\1\47\2\2\1\50\1\2\1\3\3\2\1\51"+
    "\1\2\1\52\2\2\1\53\2\2\1\54\1\2\1\55"+
    "\1\56\3\2\1\57\1\2\1\60\2\2\1\61\1\2"+
    "\1\62\1\2\1\63\1\64\1\65\1\66\1\67\1\70"+
    "\3\2\1\71\1\72\1\73";

  private static int [] zzUnpackAction() {
    int [] result = new int[182];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee"+
    "\0\u0320\0\u0352\0\62\0\62\0\u0384\0\u03b6\0\u03e8\0\u041a"+
    "\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u0546\0\u044c\0\u0578"+
    "\0\u05aa\0\u04e2\0\u05dc\0\62\0\62\0\62\0\62\0\62"+
    "\0\62\0\62\0\62\0\62\0\u060e\0\144\0\u0640\0\u0672"+
    "\0\u06a4\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e\0\u07d0\0\u0802"+
    "\0\u0834\0\u0866\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u0992"+
    "\0\u09c4\0\u09f6\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\62"+
    "\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\62\0\62\0\62\0\u0bea"+
    "\0\144\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48"+
    "\0\u0d7a\0\u0dac\0\u0dde\0\u0e10\0\u0e42\0\144\0\u0e74\0\u0ea6"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\144\0\u0fa0\0\u0fd2\0\u1004"+
    "\0\u1036\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u1162\0\u1194"+
    "\0\u11c6\0\144\0\u11f8\0\u122a\0\u125c\0\u128e\0\u12c0\0\u12f2"+
    "\0\144\0\144\0\144\0\144\0\u1324\0\u1356\0\u1388\0\144"+
    "\0\144\0\144\0\u13ba\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4"+
    "\0\u14e6\0\144\0\u1518\0\u154a\0\144\0\u157c\0\62\0\u15ae"+
    "\0\u15e0\0\u1612\0\144\0\u1644\0\144\0\u1676\0\u16a8\0\144"+
    "\0\u16da\0\u170c\0\144\0\u173e\0\144\0\144\0\u1770\0\u17a2"+
    "\0\u17d4\0\144\0\u1806\0\144\0\u1838\0\u186a\0\144\0\u189c"+
    "\0\144\0\u18ce\0\144\0\144\0\144\0\144\0\144\0\144"+
    "\0\u1900\0\u1932\0\u1964\0\144\0\144\0\144";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[182];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\3\1\7\1\10"+
    "\1\3\1\11\1\12\1\13\1\14\1\15\2\3\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\3\1\25"+
    "\1\26\1\27\1\3\1\30\1\3\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\63\0\2\3\1\0\20\3\3\0\7\3\26\0"+
    "\1\4\62\0\1\5\57\0\2\3\1\0\1\3\1\55"+
    "\13\3\1\56\2\3\3\0\7\3\25\0\2\3\1\0"+
    "\14\3\1\57\3\3\3\0\1\60\6\3\25\0\2\3"+
    "\1\0\4\3\1\61\3\3\1\62\7\3\3\0\7\3"+
    "\25\0\2\3\1\0\1\3\1\63\16\3\3\0\7\3"+
    "\25\0\2\3\1\0\14\3\1\64\3\3\3\0\1\65"+
    "\6\3\25\0\2\3\1\0\4\3\1\66\13\3\3\0"+
    "\7\3\25\0\2\3\1\0\1\3\1\67\5\3\1\70"+
    "\10\3\3\0\4\3\1\71\2\3\25\0\2\3\1\0"+
    "\1\72\3\3\1\73\5\3\1\74\1\75\4\3\3\0"+
    "\7\3\25\0\2\3\1\0\10\3\1\76\7\3\3\0"+
    "\7\3\25\0\2\3\1\0\4\3\1\77\2\3\1\100"+
    "\3\3\1\101\4\3\3\0\7\3\25\0\2\3\1\0"+
    "\2\3\1\102\6\3\1\103\1\104\5\3\3\0\5\3"+
    "\1\105\1\3\25\0\2\3\1\0\4\3\1\106\13\3"+
    "\3\0\7\3\50\0\1\107\11\0\1\110\24\0\2\3"+
    "\1\0\2\3\1\111\15\3\3\0\7\3\25\0\2\3"+
    "\1\0\14\3\1\112\3\3\3\0\7\3\25\0\2\3"+
    "\1\0\13\3\1\113\4\3\3\0\7\3\25\0\2\3"+
    "\1\0\12\3\1\114\5\3\3\0\7\3\62\0\1\115"+
    "\61\0\1\110\1\116\60\0\1\110\1\0\1\116\57\0"+
    "\1\110\65\0\1\117\62\0\1\117\54\0\1\115\6\0"+
    "\1\115\52\0\1\115\7\0\1\115\53\0\1\120\22\0"+
    "\2\3\1\0\2\3\1\121\15\3\3\0\7\3\25\0"+
    "\2\3\1\0\5\3\1\122\12\3\3\0\7\3\25\0"+
    "\2\3\1\0\20\3\3\0\2\3\1\123\4\3\25\0"+
    "\2\3\1\0\5\3\1\124\12\3\3\0\7\3\25\0"+
    "\2\3\1\0\15\3\1\125\2\3\3\0\7\3\25\0"+
    "\2\3\1\0\1\126\15\3\1\127\1\3\3\0\7\3"+
    "\25\0\2\3\1\0\10\3\1\130\7\3\3\0\7\3"+
    "\25\0\2\3\1\0\2\3\1\131\15\3\3\0\7\3"+
    "\25\0\2\3\1\0\1\3\1\132\16\3\3\0\7\3"+
    "\25\0\2\3\1\0\5\3\1\133\12\3\3\0\7\3"+
    "\25\0\2\3\1\0\16\3\1\134\1\3\3\0\7\3"+
    "\25\0\2\3\1\0\2\3\1\135\15\3\3\0\7\3"+
    "\25\0\2\3\1\0\1\3\1\136\16\3\3\0\7\3"+
    "\25\0\2\3\1\0\1\3\1\137\3\3\1\140\12\3"+
    "\3\0\7\3\25\0\2\3\1\0\13\3\1\141\4\3"+
    "\3\0\7\3\25\0\2\3\1\0\16\3\1\142\1\3"+
    "\3\0\7\3\25\0\2\3\1\0\2\3\1\143\14\3"+
    "\1\144\3\0\7\3\25\0\2\3\1\0\14\3\1\145"+
    "\3\3\3\0\7\3\25\0\2\3\1\0\4\3\1\146"+
    "\13\3\3\0\7\3\25\0\2\3\1\0\7\3\1\147"+
    "\10\3\3\0\7\3\25\0\2\3\1\0\14\3\1\150"+
    "\3\3\3\0\7\3\25\0\2\3\1\0\13\3\1\151"+
    "\4\3\3\0\7\3\25\0\2\3\1\0\4\3\1\152"+
    "\13\3\3\0\7\3\25\0\2\3\1\0\1\153\17\3"+
    "\3\0\7\3\25\0\2\3\1\0\2\3\1\154\15\3"+
    "\3\0\7\3\24\0\25\107\1\0\34\107\1\0\2\3"+
    "\1\0\14\3\1\155\3\3\3\0\7\3\25\0\2\3"+
    "\1\0\1\156\17\3\3\0\7\3\25\0\2\3\1\0"+
    "\1\157\17\3\3\0\7\3\25\0\2\3\1\0\1\160"+
    "\17\3\3\0\7\3\26\0\1\161\60\0\2\3\1\0"+
    "\10\3\1\162\7\3\3\0\7\3\25\0\2\3\1\0"+
    "\10\3\1\163\7\3\3\0\7\3\25\0\2\3\1\0"+
    "\6\3\1\164\11\3\3\0\7\3\25\0\2\3\1\0"+
    "\13\3\1\165\4\3\3\0\7\3\25\0\2\3\1\0"+
    "\4\3\1\166\13\3\3\0\7\3\25\0\2\3\1\0"+
    "\1\167\17\3\3\0\7\3\25\0\2\3\1\0\13\3"+
    "\1\170\4\3\3\0\7\3\25\0\2\3\1\0\10\3"+
    "\1\171\7\3\3\0\7\3\25\0\2\3\1\0\17\3"+
    "\1\172\3\0\7\3\25\0\2\3\1\0\20\3\3\0"+
    "\3\3\1\173\3\3\25\0\2\3\1\0\10\3\1\174"+
    "\7\3\3\0\7\3\25\0\2\3\1\0\10\3\1\175"+
    "\7\3\3\0\7\3\25\0\2\3\1\0\2\3\1\176"+
    "\13\3\1\177\1\3\3\0\7\3\25\0\2\3\1\0"+
    "\2\3\1\200\15\3\3\0\7\3\25\0\2\3\1\0"+
    "\14\3\1\201\3\3\3\0\7\3\25\0\2\3\1\0"+
    "\10\3\1\202\7\3\3\0\7\3\25\0\2\3\1\0"+
    "\5\3\1\203\12\3\3\0\7\3\25\0\2\3\1\0"+
    "\1\204\17\3\3\0\7\3\25\0\2\3\1\0\13\3"+
    "\1\205\4\3\3\0\7\3\25\0\2\3\1\0\16\3"+
    "\1\122\1\3\3\0\7\3\25\0\2\3\1\0\5\3"+
    "\1\206\12\3\3\0\7\3\25\0\2\3\1\0\1\3"+
    "\1\207\16\3\3\0\7\3\25\0\2\3\1\0\14\3"+
    "\1\210\3\3\3\0\7\3\25\0\2\3\1\0\2\3"+
    "\1\211\15\3\3\0\7\3\25\0\2\3\1\0\4\3"+
    "\1\212\13\3\3\0\7\3\25\0\2\3\1\0\1\213"+
    "\17\3\3\0\7\3\25\0\2\3\1\0\1\3\1\214"+
    "\16\3\3\0\7\3\25\0\2\3\1\0\1\3\1\215"+
    "\16\3\3\0\7\3\25\0\2\3\1\0\7\3\1\216"+
    "\10\3\3\0\7\3\26\0\1\161\46\0\1\217\11\0"+
    "\2\3\1\0\3\3\1\220\14\3\3\0\7\3\25\0"+
    "\2\3\1\0\7\3\1\221\10\3\3\0\7\3\25\0"+
    "\2\3\1\0\5\3\1\222\12\3\3\0\7\3\25\0"+
    "\2\3\1\0\1\3\1\223\16\3\3\0\7\3\25\0"+
    "\2\3\1\0\17\3\1\224\3\0\7\3\25\0\2\3"+
    "\1\0\20\3\3\0\6\3\1\225\25\0\2\3\1\0"+
    "\14\3\1\226\3\3\3\0\7\3\25\0\2\3\1\0"+
    "\1\227\17\3\3\0\7\3\25\0\2\3\1\0\2\3"+
    "\1\230\15\3\3\0\7\3\25\0\2\3\1\0\14\3"+
    "\1\231\3\3\3\0\7\3\25\0\2\3\1\0\16\3"+
    "\1\232\1\3\3\0\7\3\25\0\2\3\1\0\2\3"+
    "\1\233\15\3\3\0\7\3\25\0\2\3\1\0\11\3"+
    "\1\234\6\3\3\0\7\3\25\0\2\3\1\0\15\3"+
    "\1\235\2\3\3\0\7\3\25\0\2\3\1\0\2\3"+
    "\1\236\15\3\3\0\7\3\25\0\2\3\1\0\11\3"+
    "\1\237\6\3\3\0\7\3\25\0\2\3\1\0\1\3"+
    "\1\240\16\3\3\0\7\3\25\0\2\3\1\0\2\3"+
    "\1\241\15\3\3\0\7\3\25\0\2\3\1\0\10\3"+
    "\1\242\7\3\3\0\7\3\25\0\2\3\1\0\10\3"+
    "\1\243\7\3\3\0\7\3\25\0\2\3\1\0\10\3"+
    "\1\244\7\3\3\0\7\3\25\0\2\3\1\0\7\3"+
    "\1\245\10\3\3\0\7\3\25\0\2\3\1\0\1\3"+
    "\1\246\16\3\3\0\7\3\25\0\2\3\1\0\1\3"+
    "\1\247\16\3\3\0\7\3\25\0\2\3\1\0\1\3"+
    "\1\250\16\3\3\0\7\3\25\0\2\3\1\0\1\3"+
    "\1\251\16\3\3\0\7\3\25\0\2\3\1\0\2\3"+
    "\1\252\15\3\3\0\7\3\25\0\2\3\1\0\2\3"+
    "\1\253\15\3\3\0\7\3\25\0\2\3\1\0\12\3"+
    "\1\254\5\3\3\0\7\3\25\0\2\3\1\0\17\3"+
    "\1\255\3\0\7\3\25\0\2\3\1\0\15\3\1\256"+
    "\2\3\3\0\7\3\25\0\2\3\1\0\15\3\1\257"+
    "\2\3\3\0\7\3\25\0\2\3\1\0\2\3\1\260"+
    "\15\3\3\0\7\3\25\0\2\3\1\0\10\3\1\261"+
    "\7\3\3\0\7\3\25\0\2\3\1\0\5\3\1\262"+
    "\12\3\3\0\7\3\25\0\2\3\1\0\10\3\1\263"+
    "\7\3\3\0\7\3\25\0\2\3\1\0\3\3\1\264"+
    "\14\3\3\0\7\3\25\0\2\3\1\0\10\3\1\265"+
    "\7\3\3\0\7\3\25\0\2\3\1\0\14\3\1\266"+
    "\3\3\3\0\7\3\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6550];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\20\1\2\11\17\1\11\11\33\1\1\11"+
    "\4\1\3\11\1\0\40\1\1\0\35\1\1\11\47\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[182];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexemas;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 134) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 21: 
          { lexemas=yytext(); return Coma;
          }
        case 60: break;
        case 17: 
          { lexemas=yytext(); return Llave_c;
          }
        case 61: break;
        case 41: 
          { lexemas=yytext(); return Union;
          }
        case 62: break;
        case 30: 
          { lexemas=yytext(); return For;
          }
        case 63: break;
        case 7: 
          { lexemas=yytext(); return Comillas;
          }
        case 64: break;
        case 42: 
          { lexemas=yytext(); return Break;
          }
        case 65: break;
        case 43: 
          { lexemas=yytext(); return Const;
          }
        case 66: break;
        case 32: 
          { lexemas=yytext(); return T_dato;
          }
        case 67: break;
        case 9: 
          { lexemas=yytext(); return Suma;
          }
        case 68: break;
        case 25: 
          { lexemas=yytext(); return Do;
          }
        case 69: break;
        case 52: 
          { lexemas=yytext(); return Switch;
          }
        case 70: break;
        case 6: 
          { return Linea;
          }
        case 71: break;
        case 34: 
          { lexemas=yytext(); return Enum;
          }
        case 72: break;
        case 56: 
          { lexemas=yytext(); return Default;
          }
        case 73: break;
        case 35: 
          { lexemas=yytext(); return Else;
          }
        case 74: break;
        case 54: 
          { lexemas=yytext(); return PrintF;
          }
        case 75: break;
        case 39: 
          { lexemas=yytext(); return GoTo;
          }
        case 76: break;
        case 57: 
          { lexemas=yytext(); return Unsigned;
          }
        case 77: break;
        case 22: 
          { lexemas=yytext(); return P_Coma;
          }
        case 78: break;
        case 48: 
          { lexemas=yytext(); return Double;
          }
        case 79: break;
        case 38: 
          { lexemas=yytext(); return Case;
          }
        case 80: break;
        case 14: 
          { lexemas=yytext(); return Parent_a;
          }
        case 81: break;
        case 33: 
          { lexemas=yytext(); return Long;
          }
        case 82: break;
        case 23: 
          { lexemas=yytext(); return Dos_puntos;
          }
        case 83: break;
        case 24: 
          { lexemas=yytext(); return If;
          }
        case 84: break;
        case 50: 
          { lexemas=yytext(); return Return;
          }
        case 85: break;
        case 31: 
          { lexemas = yytext(); return Op_booleano;
          }
        case 86: break;
        case 12: 
          { lexemas=yytext(); return Op_logico;
          }
        case 87: break;
        case 18: 
          { lexemas=yytext(); return Corchete_a;
          }
        case 88: break;
        case 58: 
          { lexemas=yytext(); return Continue;
          }
        case 89: break;
        case 15: 
          { lexemas=yytext(); return Parent_c;
          }
        case 90: break;
        case 51: 
          { lexemas=yytext(); return Struct;
          }
        case 91: break;
        case 16: 
          { lexemas=yytext(); return Llave_a;
          }
        case 92: break;
        case 13: 
          { lexemas = yytext(); return Op_relacional;
          }
        case 93: break;
        case 2: 
          { lexemas=yytext(); return Identificador;
          }
        case 94: break;
        case 20: 
          { lexemas=yytext(); return Punto;
          }
        case 95: break;
        case 26: 
          { lexemas = yytext(); return Op_atribucion;
          }
        case 96: break;
        case 10: 
          { lexemas=yytext(); return Resta;
          }
        case 97: break;
        case 28: 
          { lexemas=yytext(); return Int;
          }
        case 98: break;
        case 11: 
          { lexemas=yytext(); return Multiplicacion;
          }
        case 99: break;
        case 40: 
          { lexemas=yytext(); return Main;
          }
        case 100: break;
        case 27: 
          { lexemas=yytext(); return Op_incremento;
          }
        case 101: break;
        case 49: 
          { lexemas=yytext(); return Extern;
          }
        case 102: break;
        case 46: 
          { lexemas=yytext(); return Short;
          }
        case 103: break;
        case 29: 
          { lexemas=yytext(); return Cin;
          }
        case 104: break;
        case 1: 
          { return ERROR;
          }
        case 105: break;
        case 55: 
          { lexemas=yytext(); return TypeDef;
          }
        case 106: break;
        case 3: 
          { lexemas=yytext(); return Numero;
          }
        case 107: break;
        case 59: 
          { lexemas=yytext(); return Register;
          }
        case 108: break;
        case 45: 
          { lexemas=yytext(); return ScanF;
          }
        case 109: break;
        case 36: 
          { lexemas=yytext(); return Cout;
          }
        case 110: break;
        case 5: 
          { lexemas=yytext(); return Division;
          }
        case 111: break;
        case 4: 
          { /*Ignore*/
          }
        case 112: break;
        case 19: 
          { lexemas=yytext(); return Corchete_c;
          }
        case 113: break;
        case 8: 
          { lexemas=yytext(); return Igual;
          }
        case 114: break;
        case 44: 
          { lexemas=yytext(); return Float;
          }
        case 115: break;
        case 53: 
          { lexemas=yytext(); return Cadena;
          }
        case 116: break;
        case 47: 
          { lexemas=yytext(); return While;
          }
        case 117: break;
        case 37: 
          { lexemas=yytext(); return Char;
          }
        case 118: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
