/* The following code was generated by JFlex 1.6.1 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>D:/UNIVERSIDAD/UNIVERSIDAD-VII/COMPILADORES/Fase1-proyecto/Codifo-fuente/AnalizadorHTML/src/codigo/Lexer.flex</tt>
 */
class Lexer {

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
    "\11\0\1\16\1\16\1\56\1\56\1\16\22\0\1\4\1\0\1\7"+
    "\3\0\1\10\1\0\1\47\1\50\1\51\1\52\1\0\1\53\1\6"+
    "\1\46\12\3\1\55\1\15\1\0\1\54\2\0\1\5\1\30\1\31"+
    "\1\27\1\33\1\26\1\35\1\41\1\22\1\17\2\1\1\25\1\24"+
    "\1\20\1\34\1\40\1\44\1\37\1\42\1\23\1\36\1\43\3\1"+
    "\1\32\4\0\1\21\1\0\16\1\1\13\1\1\1\11\2\1\1\14"+
    "\1\12\1\1\1\45\3\1\12\0\1\56\73\0\1\2\7\0\1\2"+
    "\3\0\1\2\3\0\1\2\1\0\1\2\6\0\1\2\1\0\1\2"+
    "\4\0\1\2\7\0\1\2\3\0\1\2\3\0\1\2\1\0\1\2"+
    "\6\0\1\2\1\0\1\2\u1f2b\0\1\56\1\56\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\1\1\5"+
    "\1\1\1\6\16\2\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\6\0\11\2\1\0\14\2\1\16\2\0"+
    "\5\2\1\17\6\2\1\0\14\2\3\0\4\2\1\0"+
    "\6\2\1\0\7\2\1\0\3\2\4\0\4\2\1\0"+
    "\1\2\1\0\4\2\1\0\3\2\1\20\1\2\1\21"+
    "\1\2\3\0\2\2\1\0\1\22\1\0\3\2\1\23"+
    "\6\0\1\24\1\2\1\0\3\2\1\25\1\2\1\0"+
    "\1\2\1\0\1\2\4\0\1\2\1\26\1\27\7\0"+
    "\1\2\1\0\1\2\1\30\1\0\1\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\31\1\32\2\0\1\33\1\0"+
    "\1\34\1\0\1\35\1\36\1\0\1\37\1\0\1\2"+
    "\1\0\1\2\4\0\1\40\1\2\1\41\3\0\1\42"+
    "\2\0\1\43\1\0\1\44\1\2\10\0\1\2\4\0"+
    "\1\45\2\0\1\2\5\0\1\46\1\47\2\0\1\2"+
    "\4\0\1\50\2\0\1\51\1\52\2\0\1\53\1\54"+
    "\1\55\1\2\1\56\1\57\1\60\1\31\3\0\1\61"+
    "\1\62\1\63\3\0\1\64\1\65\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[282];
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
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\57"+
    "\0\u0149\0\57\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263"+
    "\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db"+
    "\0\57\0\57\0\57\0\57\0\57\0\57\0\57\0\215"+
    "\0\u040a\0\u011a\0\u0439\0\u0468\0\u0497\0\u04c6\0\u04f5\0\u0524"+
    "\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c"+
    "\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814"+
    "\0\u0843\0\u0872\0\u040a\0\u0439\0\u08a1\0\u08d0\0\u08ff\0\u092e"+
    "\0\u095d\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u0aa6"+
    "\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e"+
    "\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96"+
    "\0\u0dc5\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e"+
    "\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u1028\0\u1057\0\u1086"+
    "\0\u10b5\0\u10e4\0\u1113\0\u1142\0\u1171\0\u11a0\0\u11cf\0\u11fe"+
    "\0\u122d\0\u125c\0\u128b\0\u12ba\0\u12e9\0\u1318\0\u1347\0\u1376"+
    "\0\u13a5\0\u13d4\0\u1403\0\u1432\0\u1461\0\u1490\0\u14bf\0\u14ee"+
    "\0\u151d\0\u154c\0\u157b\0\u15aa\0\136\0\u15d9\0\136\0\u1608"+
    "\0\u1637\0\u1666\0\u1695\0\u16c4\0\u16f3\0\u1722\0\u128b\0\u1751"+
    "\0\u1780\0\u17af\0\u17de\0\136\0\u180d\0\u183c\0\u186b\0\u189a"+
    "\0\u18c9\0\u18f8\0\136\0\u1927\0\u1956\0\u1985\0\u19b4\0\u19e3"+
    "\0\136\0\u1a12\0\u1a41\0\u1a70\0\u1a9f\0\u1ace\0\u1afd\0\u1b2c"+
    "\0\u1b5b\0\u1b8a\0\u1bb9\0\u1be8\0\57\0\u1c17\0\u1c46\0\u1c75"+
    "\0\u1ca4\0\u1cd3\0\u1d02\0\u1d31\0\u1d60\0\u1d8f\0\u1dbe\0\u1ded"+
    "\0\u1e1c\0\u1e4b\0\u1e7a\0\u1ea9\0\u1ed8\0\u1f07\0\u1f36\0\u1f65"+
    "\0\57\0\u1f94\0\u1fc3\0\136\0\u1ff2\0\57\0\u2021\0\57"+
    "\0\57\0\u2050\0\57\0\u207f\0\u20ae\0\u20dd\0\u210c\0\u213b"+
    "\0\u216a\0\u2199\0\u21c8\0\57\0\u21f7\0\57\0\u2226\0\u2255"+
    "\0\u2284\0\57\0\u22b3\0\u22e2\0\57\0\u2311\0\57\0\u2340"+
    "\0\u236f\0\u239e\0\u23cd\0\u23fc\0\u242b\0\u245a\0\u2489\0\u24b8"+
    "\0\u24e7\0\u2516\0\u2545\0\u2574\0\u25a3\0\57\0\u25d2\0\u2601"+
    "\0\u2630\0\u265f\0\u268e\0\u26bd\0\u26ec\0\u271b\0\57\0\57"+
    "\0\u274a\0\u2779\0\u27a8\0\u27d7\0\u2806\0\u2835\0\u2864\0\57"+
    "\0\u2893\0\u28c2\0\57\0\57\0\u28f1\0\u2920\0\57\0\57"+
    "\0\57\0\u294f\0\57\0\57\0\57\0\u2864\0\u297e\0\u29ad"+
    "\0\u29dc\0\57\0\57\0\u040a\0\u2a0b\0\u2a3a\0\u2a69\0\57"+
    "\0\57\0\57";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[282];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\4\3\1\12\1\6\1\13\1\14\1\2\1\3"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\3"+
    "\1\24\1\3\1\25\2\3\1\26\1\3\1\27\2\3"+
    "\1\30\1\2\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\61\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\24\3\12\0\3\40\1\0\1\42"+
    "\3\0\4\40\2\0\2\40\1\0\24\40\12\0\2\40"+
    "\1\5\1\0\1\42\1\43\2\0\4\40\2\0\2\40"+
    "\1\0\24\40\15\0\1\6\11\0\1\6\41\0\2\44"+
    "\6\0\4\44\2\0\2\44\1\0\24\44\22\0\1\45"+
    "\46\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\1\3\1\46\1\0\2\3\1\47\21\3\12\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\4\3\1\50\5\3\1\51\11\3\12\0\1\3\2\40"+
    "\1\41\1\42\3\0\4\3\2\0\1\52\1\3\1\0"+
    "\6\3\1\53\15\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\0\4\3\1\54\17\3"+
    "\12\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\1\55\1\3\1\0\24\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\1\3\1\56\1\57\1\3"+
    "\1\60\22\3\12\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\0\12\3\1\61\1\3\1\62"+
    "\7\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\1\3\1\63\1\0\3\3\1\64\20\3\12\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\0\12\3\1\65\11\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\1\66\1\3\1\0\24\3"+
    "\12\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\1\67\1\3\1\0\24\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\0\6\3\1\70"+
    "\15\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\6\3\1\71\15\3\12\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\23\3\1\72\12\0\1\73\7\0\4\73\2\0\2\73"+
    "\1\0\24\73\14\0\1\74\54\0\2\44\3\0\1\75"+
    "\2\0\4\44\2\0\2\44\1\0\24\44\23\0\1\76"+
    "\45\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\1\77\1\3\1\0\24\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\0\6\3\1\100"+
    "\7\3\1\101\5\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\0\17\3\1\102\4\3"+
    "\12\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\2\3\1\0\2\3\1\103\21\3\12\0\1\3\2\40"+
    "\1\41\1\42\3\0\4\3\2\0\2\3\1\0\1\3"+
    "\1\104\22\3\12\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\0\7\3\1\105\14\3\12\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\1\3"+
    "\1\106\1\0\24\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\1\3\1\107\1\0\20\3\1\110"+
    "\3\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\3\3\1\111\1\3\1\112\16\3"+
    "\36\0\1\113\32\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\1\114\1\3\1\0\24\3\12\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\3\3\1\115\20\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\0\4\3\1\116\17\3"+
    "\12\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\2\3\1\0\5\3\1\117\16\3\12\0\1\3\2\40"+
    "\1\41\1\42\3\0\4\3\2\0\2\3\1\0\1\3"+
    "\1\120\22\3\12\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\0\15\3\1\121\6\3\12\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\0\6\3\1\122\15\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\1\3\1\123\1\0\3\3"+
    "\1\124\20\3\12\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\0\15\3\1\125\6\3\12\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\0\3\3\1\126\20\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\0\23\3\1\127"+
    "\12\0\2\130\6\0\4\130\2\0\2\130\1\0\24\130"+
    "\24\0\1\131\44\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\132\24\3\12\0\1\3\2\40"+
    "\1\41\1\42\3\0\4\3\2\0\2\3\1\0\17\3"+
    "\1\133\4\3\12\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\0\15\3\1\134\6\3\12\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\0\15\3\1\135\6\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\0\7\3\1\136"+
    "\14\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\137\24\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\0\3\3\1\140"+
    "\20\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\14\3\1\141\7\3\12\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\4\3\1\142\17\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\0\1\3\1\143\22\3"+
    "\12\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\2\3\1\0\6\3\1\144\15\3\12\0\1\3\2\40"+
    "\1\41\1\42\3\0\4\3\2\0\2\3\1\0\6\3"+
    "\1\145\15\3\30\0\1\146\40\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\0\22\3\1\147"+
    "\1\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\14\3\1\150\7\3\12\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\15\3\1\151\6\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\0\1\152\23\3\12\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\0\14\3\1\153\7\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\0\11\3\1\154"+
    "\12\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\3\3\1\155\20\3\12\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\156"+
    "\24\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\6\3\1\157\15\3\12\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\15\3\1\160\6\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\0\1\3\1\161\22\3"+
    "\12\0\1\3\2\40\1\41\1\42\1\162\2\0\4\3"+
    "\2\0\2\3\1\0\24\3\12\0\2\130\3\0\1\163"+
    "\2\0\4\130\2\0\2\130\1\0\24\130\25\0\1\164"+
    "\64\0\1\165\35\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\0\4\3\1\166\17\3\12\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\1\167"+
    "\1\3\1\0\24\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\1\170\1\3\1\0\24\3\12\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\0\15\3\1\171\6\3\46\0\1\172\22\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\6\3\1\173\15\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\174\24\3\12\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\6\3\1\175\15\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\0\6\3\1\176\15\3"+
    "\12\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\2\3\1\0\5\3\1\177\16\3\12\0\1\3\2\40"+
    "\1\41\1\42\3\0\4\3\2\0\2\3\1\0\7\3"+
    "\1\200\14\3\53\0\1\201\15\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\0\14\3\1\202"+
    "\7\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\2\3\1\203\21\3\12\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\16\3\1\204\5\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\0\12\3\1\205\11\3"+
    "\12\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\2\3\1\0\15\3\1\206\6\3\12\0\1\3\2\40"+
    "\1\41\1\42\3\0\4\3\2\0\2\3\1\0\4\3"+
    "\1\207\17\3\12\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\0\12\3\1\210\11\3\33\0"+
    "\1\211\35\0\1\3\2\40\1\212\1\42\3\0\4\3"+
    "\2\0\2\3\1\213\24\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\0\6\3\1\214"+
    "\15\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\12\3\1\215\11\3\12\0\1\216"+
    "\7\0\4\216\2\0\2\216\1\0\24\216\12\0\2\217"+
    "\6\0\4\217\2\0\2\217\1\0\24\217\26\0\1\10"+
    "\64\0\1\220\34\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\1\3\1\221\1\0\24\3\12\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\2\3\1\222\21\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\0\1\3\1\223\22\3"+
    "\12\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\2\3\1\0\4\3\1\224\17\3\30\0\1\225\40\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\226\24\3\30\0\1\227\15\0\1\230\22\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\231"+
    "\24\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\232\24\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\0\4\3\1\233"+
    "\17\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\4\3\1\234\17\3\34\0\1\235"+
    "\34\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\2\3\1\0\4\3\1\236\17\3\12\0\1\3\2\40"+
    "\1\41\1\42\3\0\4\3\2\0\1\3\1\237\1\0"+
    "\24\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\12\3\1\240\11\3\12\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\6\3\1\241\15\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\0\17\3\1\242\4\3"+
    "\34\0\1\243\34\0\1\73\7\0\4\73\2\0\2\73"+
    "\1\0\5\73\1\244\16\73\46\0\1\245\22\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\13\3\1\246\10\3\12\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\247\24\3\12\0\1\216"+
    "\4\0\1\250\2\0\4\216\2\0\2\216\1\0\24\216"+
    "\35\0\1\251\33\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\252\24\3\12\0\1\3\2\40"+
    "\1\41\1\42\3\0\4\3\2\0\1\253\1\3\1\0"+
    "\24\3\12\0\1\3\2\40\1\41\1\42\3\0\4\3"+
    "\2\0\2\3\1\0\6\3\1\254\15\3\31\0\1\255"+
    "\55\0\1\256\15\0\1\257\41\0\1\260\55\0\1\261"+
    "\72\0\1\262\42\0\1\263\15\0\1\264\22\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\10\3\1\265\13\3\41\0\1\266\27\0\1\3\2\40"+
    "\1\41\1\42\3\0\4\3\2\0\2\3\1\0\1\3"+
    "\1\267\22\3\12\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\0\6\3\1\270\15\3\12\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\271\24\3\12\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\0\12\3\1\272\11\3\35\0"+
    "\1\273\33\0\1\73\7\0\4\73\2\0\2\73\1\0"+
    "\12\73\1\274\11\73\30\0\1\275\40\0\1\3\2\40"+
    "\1\41\1\42\3\0\4\3\2\0\2\3\1\0\12\3"+
    "\1\276\11\3\36\0\1\277\32\0\1\300\7\0\4\300"+
    "\2\0\2\300\1\0\24\300\36\0\1\301\50\0\1\302"+
    "\15\0\1\303\22\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\0\15\3\1\304\6\3\12\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\305\24\3\31\0\1\306\55\0\1\307\56\0\1\310"+
    "\57\0\1\311\55\0\1\312\57\0\1\313\55\0\1\314"+
    "\40\0\1\3\2\40\1\41\1\42\3\0\4\3\2\0"+
    "\2\3\1\0\6\3\1\315\15\3\32\0\1\316\36\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\0\6\3\1\317\15\3\12\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\320\24\3\30\0"+
    "\1\321\15\0\1\322\22\0\1\3\2\40\1\41\1\42"+
    "\3\0\4\3\2\0\2\3\1\323\24\3\36\0\1\324"+
    "\32\0\1\73\7\0\4\73\2\0\2\73\1\0\3\73"+
    "\1\325\20\73\31\0\1\326\37\0\1\3\2\40\1\41"+
    "\1\42\3\0\4\3\2\0\2\3\1\327\24\3\30\0"+
    "\1\330\40\0\1\300\7\0\4\300\2\0\2\300\1\0"+
    "\24\300\1\331\30\0\1\332\55\0\1\333\74\0\1\334"+
    "\41\0\1\335\101\0\1\336\33\0\1\337\37\0\1\3"+
    "\2\40\1\41\1\42\3\0\4\3\2\0\2\3\1\0"+
    "\11\3\1\340\12\3\30\0\1\341\15\0\1\342\22\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\343\24\3\46\0\1\344\41\0\1\345\55\0\1\346"+
    "\56\0\1\347\15\0\1\350\22\0\1\73\7\0\4\73"+
    "\2\0\2\73\1\0\14\73\1\351\7\73\30\0\1\352"+
    "\15\0\1\353\41\0\1\354\37\0\1\355\7\0\4\355"+
    "\2\0\2\355\1\0\24\355\31\0\1\356\55\0\1\357"+
    "\56\0\1\360\40\0\1\3\2\40\1\41\1\42\3\0"+
    "\4\3\2\0\2\3\1\0\12\3\1\361\11\3\31\0"+
    "\1\362\55\0\1\363\56\0\1\364\15\0\1\365\40\0"+
    "\1\366\56\0\1\367\57\0\1\370\56\0\1\371\55\0"+
    "\1\372\40\0\1\73\7\0\4\73\2\0\2\73\1\0"+
    "\2\73\1\373\21\73\31\0\1\374\55\0\1\375\65\0"+
    "\1\376\31\0\1\355\4\0\1\377\2\0\4\355\2\0"+
    "\2\355\1\0\24\355\31\0\1\u0100\100\0\1\u0101\15\0"+
    "\1\3\2\40\1\41\1\42\3\0\4\3\2\0\2\3"+
    "\1\u0102\24\3\30\0\1\u0103\57\0\1\u0104\56\0\1\u0105"+
    "\55\0\1\u0106\57\0\1\u0107\55\0\1\u0108\57\0\1\u0109"+
    "\37\0\1\73\7\0\4\73\2\0\1\73\1\u010a\1\0"+
    "\24\73\30\0\1\u010b\57\0\1\u010c\66\0\1\u010d\27\0"+
    "\1\u010e\7\0\4\u010e\2\0\2\u010e\1\0\24\u010e\45\0"+
    "\1\u010f\41\0\1\u0110\15\0\1\u0111\40\0\1\u0112\57\0"+
    "\1\u0113\37\0\1\73\7\0\4\73\2\0\2\73\1\0"+
    "\6\73\1\u0114\15\73\50\0\1\u0115\37\0\1\u0116\55\0"+
    "\1\u0117\67\0\1\u0118\45\0\1\u0119\57\0\1\u011a\36\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10904];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\1\11\1\1\1\11\16\1\7\11"+
    "\6\0\11\1\1\0\15\1\2\0\14\1\1\0\14\1"+
    "\3\0\4\1\1\0\6\1\1\0\7\1\1\0\3\1"+
    "\4\0\4\1\1\0\1\1\1\0\4\1\1\0\7\1"+
    "\3\0\2\1\1\0\1\1\1\0\4\1\6\0\2\1"+
    "\1\0\5\1\1\0\1\1\1\0\1\1\4\0\2\1"+
    "\1\11\7\0\1\1\1\0\2\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\11\2\0\1\1"+
    "\1\0\1\11\1\0\2\11\1\0\1\11\1\0\1\1"+
    "\1\0\1\1\4\0\1\11\1\1\1\11\3\0\1\11"+
    "\2\0\1\11\1\0\1\11\1\1\10\0\1\1\4\0"+
    "\1\11\2\0\1\1\5\0\2\11\2\0\1\1\4\0"+
    "\1\11\2\0\2\11\2\0\3\11\1\1\3\11\1\1"+
    "\3\0\2\11\1\1\3\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[282];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public String Lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 228) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return Error;
            }
          case 55: break;
          case 2: 
            { Lexeme = yytext(); return CADENA_NO_ESPECIFICA;
            }
          case 56: break;
          case 3: 
            { Lexeme = yytext(); return NUMERO_ENTERO;
            }
          case 57: break;
          case 4: 
            { /*Ignore*/
            }
          case 58: break;
          case 5: 
            { Lexeme = yytext(); return Comilla;
            }
          case 59: break;
          case 6: 
            { Lexeme = yytext(); return PUNTO_COMA;
            }
          case 60: break;
          case 7: 
            { Lexeme = yytext(); return PARENTESIS_APERTURA;
            }
          case 61: break;
          case 8: 
            { Lexeme = yytext(); return PARENTESIS_CIERRE;
            }
          case 62: break;
          case 9: 
            { Lexeme = yytext(); return SIGNO_MULTIPLICACION;
            }
          case 63: break;
          case 10: 
            { Lexeme = yytext(); return SIGNO_SUMA;
            }
          case 64: break;
          case 11: 
            { Lexeme = yytext(); return SIGNO_RESTA;
            }
          case 65: break;
          case 12: 
            { Lexeme = yytext(); return SIGNO_IGUAL;
            }
          case 66: break;
          case 13: 
            { Lexeme = yytext(); return DOS_PUNTOS;
            }
          case 67: break;
          case 14: 
            { Lexeme = yytext(); return NUMERO_DECIMAL;
            }
          case 68: break;
          case 15: 
            { Lexeme = yytext(); return TITULO;
            }
          case 69: break;
          case 16: 
            { Lexeme = yytext(); return MEDIDA_ANCHO;
            }
          case 70: break;
          case 17: 
            { Lexeme = yytext(); return BORDE_TABLA;
            }
          case 71: break;
          case 18: 
            { Lexeme = yytext(); return CORREO_ELECTRONICO;
            }
          case 72: break;
          case 19: 
            { Lexeme = yytext(); return NOMBRE_ELEMENTO;
            }
          case 73: break;
          case 20: 
            { Lexeme = yytext(); return ENLACE_WEB;
            }
          case 74: break;
          case 21: 
            { Lexeme = yytext(); return MEDIDA_ALTURA;
            }
          case 75: break;
          case 22: 
            { Lexeme = yytext(); return TEXTO_FUERTE;
            }
          case 76: break;
          case 23: 
            { Lexeme = yytext(); return FINAL_TITULO;
            }
          case 77: break;
          case 24: 
            { Lexeme = yytext(); return COLUMNA;
            }
          case 78: break;
          case 25: 
            { Lexeme=yytext(); return URL;
            }
          case 79: break;
          case 26: 
            { Lexeme = yytext(); return INICIO_HTML;
            }
          case 80: break;
          case 27: 
            { Lexeme = yytext(); return SALIDA_TEXTO;
            }
          case 81: break;
          case 28: 
            { Lexeme = yytext(); return INICIO_TABLA;
            }
          case 82: break;
          case 29: 
            { Lexeme = yytext(); return INICIO_MENU;
            }
          case 83: break;
          case 30: 
            { Lexeme = yytext(); return FINAL_MENU;
            }
          case 84: break;
          case 31: 
            { Lexeme = yytext(); return INICIO_LISTA;
            }
          case 85: break;
          case 32: 
            { Lexeme = yytext(); return FINAL_HTML;
            }
          case 86: break;
          case 33: 
            { Lexeme = yytext(); return FINAL_FILA;
            }
          case 87: break;
          case 34: 
            { Lexeme = yytext(); return INICIO_IMAGEN;
            }
          case 88: break;
          case 35: 
            { Lexeme = yytext(); return FINAL_TABLA;
            }
          case 89: break;
          case 36: 
            { Lexeme = yytext(); return FINAL_LISTA;
            }
          case 90: break;
          case 37: 
            { Lexeme = yytext(); return FINAL_IMAGEN;
            }
          case 91: break;
          case 38: 
            { Lexeme = yytext(); return INICIO_CUERPO;
            }
          case 92: break;
          case 39: 
            { Lexeme = yytext(); return FINAL_CUERPO;
            }
          case 93: break;
          case 40: 
            { Lexeme = yytext(); return TEXTO_FUERTE_FIN;
            }
          case 94: break;
          case 41: 
            { Lexeme = yytext(); return INICIO_ELEMENTO_LISTA;
            }
          case 95: break;
          case 42: 
            { Lexeme = yytext(); return FINAL_ELEMENTO_LISTA;
            }
          case 96: break;
          case 43: 
            { Lexeme = yytext(); return COLUMNA_FIN;
            }
          case 97: break;
          case 44: 
            { Lexeme = yytext(); return INICIO_DIALOGO;
            }
          case 98: break;
          case 45: 
            { Lexeme = yytext(); return FINAL_DIALOGO;
            }
          case 99: break;
          case 46: 
            { Lexeme = yytext(); return INICIO_PARRAFO;
            }
          case 100: break;
          case 47: 
            { Lexeme = yytext(); return FINAL_PARRAFO;
            }
          case 101: break;
          case 48: 
            { Lexeme = yytext(); return SALTO_LINEA;
            }
          case 102: break;
          case 49: 
            { Lexeme = yytext(); return INICIO_ETIQUETA;
            }
          case 103: break;
          case 50: 
            { Lexeme = yytext(); return FINAL_ETIQUETA;
            }
          case 104: break;
          case 51: 
            { Lexeme = yytext();return FILA_INICIO;
            }
          case 105: break;
          case 52: 
            { Lexeme = yytext(); return LINEA_DIVISORA;
            }
          case 106: break;
          case 53: 
            { Lexeme = yytext(); return INICIO_ENCABEZADO;
            }
          case 107: break;
          case 54: 
            { Lexeme = yytext(); return FINAL_ENCABEZADO;
            }
          case 108: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
