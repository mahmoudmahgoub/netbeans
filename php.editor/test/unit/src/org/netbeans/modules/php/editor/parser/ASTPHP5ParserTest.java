/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2015 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2015 Sun Microsystems, Inc.
 */

package org.netbeans.modules.php.editor.parser;

import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java_cup.runtime.Symbol;
import org.netbeans.modules.php.editor.lexer.PHPLexerUtils;
import org.netbeans.modules.php.editor.parser.astnodes.Program;

/**
 *
 * @author Petr Pisl
 */
public class ASTPHP5ParserTest extends ParserTestBase {

    public ASTPHP5ParserTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testInclude() throws Exception {
        performTest("parser/include");
    }

    public void testGotoStatment() throws Exception {
        performTest("parser/gotostatement");
    }
    public void testLambdaFunction() throws Exception {
        performTest("parser/lambdaFunction");
    }
    public void testLambdaFunctionWithParams() throws Exception {
        performTest("parser/lambdaFunctionWithParams");
    }
    public void testLambdaFunctionWithParamsWithVars() throws Exception {
        performTest("parser/lambdaFunctionWithParamsWithVars");
    }
    public void testLambdaFunctionWithParamsWithVarsWithStatements() throws Exception {
        performTest("parser/lambdaFunctionWithParamsWithVarsWithStatements");
    }
    public void testMultipleBracketedNamespaces() throws Exception {
        performTest("parser/multipleBracketedNamespaces");
    }
    public void testMultipleUnBracketedNamespaces1() throws Exception {
        performTest("parser/multipleUnBracketedNamespaces1");
    }
    public void testMultipleUnBracketedNamespaces2() throws Exception {
        performTest("parser/multipleUnBracketedNamespaces2");
    }
    public void testNamespaceDeclaration() throws Exception {
        performTest("parser/namespaceDeclaration");
    }
    public void testSubNamespaceDeclaration() throws Exception {
        performTest("parser/subNamespaceDeclaration");
    }
    public void testNamespaceElementDeclarations() throws Exception {
        performTest("parser/namespaceElementDeclarations");
    }
    public void testNowDoc() throws Exception {
        performTest("parser/nowDoc");
    }
    public void testRefLambdaFunctionWithParamsWithVarsWithStatements() throws Exception {
        performTest("parser/refLambdaFunctionWithParamsWithVarsWithStatements");
    }
    public void testTernaryOperator() throws Exception {
        performTest("parser/ternaryOperator");
    }
    public void testUseGlobal() throws Exception {
        performTest("parser/useGlobal");
    }
    public void testUseGlobalSubNamespace() throws Exception {
        performTest("parser/useGlobalSubNamespace");
    }
    public void testUseNamespaceAs() throws Exception {
        performTest("parser/useNamespaceAs");
    }
    public void testUseSimple() throws Exception {
        performTest("parser/useSimple");
    }
    public void testUseSubNamespace() throws Exception {
        performTest("parser/useSubNamespace");
    }
    public void testTextSearchQuery () throws Exception {
        // testing real file from phpwiki
        performTest("parser/TextSearchQuery");
    }

    public void testPHPDoc () throws Exception {
        //unfinished phpdoc
        performTest("parser/test01");
    }

    public void testNowdoc_01 () throws Exception {
        performTest("parser/nowdoc01");
    }

    public void testNowdoc_02() throws Exception {
        performTest("parser/nowdoc02");
    }

    public void testNowdoc_03() throws Exception {
        performTest("parser/nowdoc_000");
    }

    public void testNowdoc_04() throws Exception {
        performTest("parser/nowdoc_001");
    }

    public void testNowdoc_05() throws Exception {
        performTest("parser/nowdoc_002");
    }

    public void testNowdoc_06() throws Exception {
        performTest("parser/nowdoc_003");
    }

    public void testNowdoc_07() throws Exception {
        performTest("parser/nowdoc_004");
    }

    public void testNowdoc_08() throws Exception {
        performTest("parser/nowdoc_005");
    }

    public void testNowdoc_09() throws Exception {
        performTest("parser/nowdoc_006");
    }

    public void testNowdoc_10() throws Exception {
        performTest("parser/nowdoc_007");
    }

    public void testNowdoc_11() throws Exception {
        performTest("parser/nowdoc_008");
    }

    public void testNowdoc_12() throws Exception {
        performTest("parser/nowdoc_009");
    }

    public void testNowdoc_13() throws Exception {
        performTest("parser/nowdoc_010");
    }

    public void testNowdoc_14() throws Exception {
        performTest("parser/nowdoc_011");
    }

    public void testNowdoc_15() throws Exception {
        performTest("parser/nowdoc_012");
    }

    public void testNowdoc_16() throws Exception {
        performTest("parser/nowdoc_013");
    }

    public void testNowdoc_17() throws Exception {
        performTest("parser/nowdoc_014");
    }

    public void testNowdoc_18() throws Exception {
        performTest("parser/nowdoc_015");
    }

    public void testHereDoc_01() throws Exception {
        performTest("parser/heredoc00");
    }

    public void testHereDoc_02() throws Exception {
        performTest("parser/heredoc01");
    }

    public void testHereDoc_03() throws Exception {
        performTest("parser/heredoc_001");
    }

    public void testHereDoc_04() throws Exception {
        performTest("parser/heredoc_002");
    }

    public void testHereDoc_05() throws Exception {
        performTest("parser/heredoc_003");
    }

    public void testHereDoc_06() throws Exception {
        performTest("parser/heredoc_004");
    }

    public void testHereDoc_07() throws Exception {
        performTest("parser/heredoc_005");
    }

    public void testHereDoc_08() throws Exception {
        performTest("parser/heredoc_006");
    }

    public void testHereDoc_09() throws Exception {
        performTest("parser/heredoc_007");
    }

    public void testHereDoc_10() throws Exception {
        performTest("parser/heredoc_008");
    }

    public void testHereDoc_11() throws Exception {
        performTest("parser/heredoc_009");
    }

    public void testHereDoc_12() throws Exception {
        performTest("parser/heredoc_010");
    }

    public void testHereDoc_13() throws Exception {
        performTest("parser/heredoc_011");
    }

    public void testHereDoc_14() throws Exception {
        performTest("parser/heredoc_012");
    }

    public void testHereDoc_15() throws Exception {
        performTest("parser/heredoc_013");
    }

    public void testHereDoc_16() throws Exception {
        performTest("parser/heredoc_014");
    }

    public void testHereDoc_17() throws Exception {
        performTest("parser/heredoc_015");
    }

    public void testVarCommentSimple01() throws Exception {
        performTest("parser/simple01");
    }

    public void testVarCommentSimple02() throws Exception {
        performTest("parser/simple02");
    }

    public void testVarCommentMixedType01() throws Exception {
        performTest("parser/mixed01");
    }

    public void testVarCommentMixedType02() throws Exception {
        performTest("parser/mixed02");
    }

    public void testMagicMethod01() throws Exception {
        performTest("parser/magicMethod01");
    }

    public void testMagicMethod02() throws Exception {
        performTest("parser/magicMethod02");
    }

    public void testMagicMethod03() throws Exception {
        performTest("parser/magicMethod03");
    }

    public void testMagicMethod04() throws Exception {
        performTest("parser/magicMethod04");
    }

    public void testMagicMethod05() throws Exception {
        performTest("parser/magicMethod05");
    }

    public void testMagicMethod06() throws Exception {
        performTest("parser/magicMethod06");
    }

    public void testMagicMethod07() throws Exception {
        performTest("parser/magicMethod07");
    }

    public void testTraits_01() throws Exception {
        performTest("parser/traits_01");
    }

    public void testTraits_02() throws Exception {
        performTest("parser/traits_02");
    }

    public void testTraits_03() throws Exception {
        performTest("parser/traits_03");
    }

    public void testTraits_04() throws Exception {
        performTest("parser/traits_04");
    }

    public void testTraits_05() throws Exception {
        performTest("parser/traits_05");
    }

    public void testTraits_06() throws Exception {
        performTest("parser/traits_06");
    }

    public void testShortArrays_01() throws Exception {
        performTest("parser/shortArrays_01");
    }

    public void testShortArrays_02() throws Exception {
        performTest("parser/shortArrays_02");
    }

    public void testShortArraysStaticScalar_01() throws Exception {
        performTest("parser/shortArraysStaticScalar_01");
    }

    public void testShortArraysStaticScalar_02() throws Exception {
        performTest("parser/shortArraysStaticScalar_02");
    }

    public void testShortEchoSyntax() throws Exception {
        performTest("parser/shortEchoSyntax");
    }

    public void testAnonymousObjectVariable() throws Exception {
        performTest("parser/anonymousObjectVariable");
    }

    public void testFieldArraysWithArrayDereferencing() throws Exception {
        performTest("parser/fieldArraysWithArrayDereferencing");
    }

    public void testArrayDereferencing_01() throws Exception {
        performTest("parser/arrayDereferencing_01");
    }

    public void testArrayDereferencing_02() throws Exception {
        performTest("parser/arrayDereferencing_02");
    }

    public void testArrayDereferencing_03() throws Exception {
        performTest("parser/arrayDereferencing_03");
    }

    public void testArrayDereferencing_04() throws Exception {
        performTest("parser/arrayDereferencing_04");
    }

    public void testArrayDereferencing_05() throws Exception {
        performTest("parser/arrayDereferencing_05");
    }

    public void testArrayDereferencing_06() throws Exception {
        performTest("parser/arrayDereferencing_06");
    }

    public void testArrayDereferencing_07() throws Exception {
        performTest("parser/arrayDereferencing_07");
    }

    public void testArrayDereferencing_08() throws Exception {
        performTest("parser/arrayDereferencing_08");
    }

    public void testArrayDereferencing_09() throws Exception {
        performTest("parser/arrayDereferencing_09");
    }

    public void testBinaryNotation_01() throws Exception {
        performTest("parser/binaryNotation_01");
    }

    public void testBinaryNotation_02() throws Exception {
        performTest("parser/binaryNotation_02");
    }

    public void testBinaryNotation_03() throws Exception {
        performTest("parser/binaryNotation_03");
    }

    public void testBinaryNotation_04() throws Exception {
        performTest("parser/binaryNotation_04");
    }

    public void testStaticExpressionCall_01() throws Exception {
        performTest("parser/staticExpressionCall_01");
    }

    public void testStaticExpressionCall_02() throws Exception {
        performTest("parser/staticExpressionCall_02");
    }

    public void testCfunction() throws Exception {
        performTest("parser/cfunction");
    }

    public void testInstanceOfExpression() throws Exception {
        performTest("parser/instanceOfExpression");
    }

    public void testIssue170712() throws Exception {
        performTest("parser/issue170712");
    }

    public void testIssue200501() throws Exception {
        performTest("parser/issue200501");
    }

    public void testIssue213423() throws Exception {
        performTest("parser/issue213423");
    }

    public void testFinally_01() throws Exception {
        performTest("parser/finally_01");
    }

    public void testFinally_02() throws Exception {
        performTest("parser/finally_02");
    }

    public void testFinally_03() throws Exception {
        performTest("parser/finally_03");
    }

    public void testListInForeach_01() throws Exception {
        performTest("parser/listInForeach_01");
    }

    public void testListInForeach_02() throws Exception {
        // #257945
        performTest("parser/listInForeach_02");
    }

    public void testExpressionArrayAccess_01() throws Exception {
        performTest("parser/expressionArrayAccess_01");
    }

    public void testExpressionArrayAccess_02() throws Exception {
        performTest("parser/expressionArrayAccess_02");
    }

    public void testExpressionArrayAccess_03() throws Exception {
        performTest("parser/expressionArrayAccess_03");
    }

    public void testYield_01() throws Exception {
        performTest("parser/yield_01");
    }

    public void testYield_02() throws Exception {
        performTest("parser/yield_02");
    }

    public void testYield_03() throws Exception {
        performTest("parser/yield_03");
    }

    public void testYield_04() throws Exception {
        performTest("parser/yield_04");
    }

    public void testYield_05() throws Exception {
        // it's available since PHP7
        performTest("parser/yield_05");
    }

    public void testYield_06() throws Exception {
        // it's available since PHP7
        performTest("parser/yield_06");
    }

    public void testYield_07() throws Exception {
        performTest("parser/yield_07");
    }

    public void testExponentiation_01() throws Exception {
        performTest("parser/exponentiation_01");
    }

    // #250579
    public void testConstantArrayAccess_01() throws Exception {
        performTest("parser/constantArrayAccess_01");
    }

    public void testConstantScalarExpressions_01() throws Exception {
        performTest("parser/constantScalarExpressions_01");
    }

    public void testVariadicFunctions_01() throws Exception {
        performTest("parser/testVariadicFunctions_01");
    }

    public void testVariadicFunctions_02() throws Exception {
        performTest("parser/testVariadicFunctions_02");
    }

    public void testArgumentUnpacking_01() throws Exception {
        performTest("parser/argumentUnpacking_01");
    }

    public void testUseFuncAndConst_01() throws Exception {
        performTest("parser/useFuncAndConst_01");
    }

    public void testSpaceship01() throws Exception {
        performTest("parser/spaceship_01");
    }

    public void testSpaceship02() throws Exception {
        performTest("parser/spaceship_02");
    }

    public void testCoalesce01() throws Exception {
        performTest("parser/coalesce_01");
    }

    public void testCoalesce02() throws Exception {
        performTest("parser/coalesce_02");
    }

    public void testReturnTypes01() throws Exception {
        performTest("parser/returnTypes_01");
    }

    public void testReturnTypes02() throws Exception {
        performTest("parser/returnTypes_02");
    }

    public void testReturnTypes03() throws Exception {
        performTest("parser/returnTypes_03");
    }

    public void testReturnTypes04() throws Exception {
        performTest("parser/returnTypes_04");
    }

    public void testReturnTypes05() throws Exception {
        performTest("parser/returnTypes_05");
    }

    public void testYieldFrom01() throws Exception {
        performTest("parser/yieldFrom_01");
    }

    public void testYieldFrom02() throws Exception {
        performTest("parser/yieldFrom_02");
    }

    public void testYieldFrom03() throws Exception {
        performTest("parser/yieldFrom_03");
    }

    public void testYieldFrom04() throws Exception {
        performTest("parser/yieldFrom_04");
    }

    public void testYieldFrom05() throws Exception {
        performTest("parser/yieldFrom_05");
    }

    public void testYieldFrom06() throws Exception {
        performTest("parser/yieldFrom_06");
    }

    public void testAnonymousClass01() throws Exception {
        performTest("parser/anonymousClass_01");
    }

    public void testUniformVariableSyntax_01() throws Exception {
        performTest("parser/uniformVariableSyntax_01");
    }

    public void testUniformVariableSyntax_02() throws Exception {
        performTest("parser/uniformVariableSyntax_02");
    }

    public void testUniformVariableSyntax_03() throws Exception {
        performTest("parser/uniformVariableSyntax_03");
    }

    public void testUniformVariableSyntax_04() throws Exception {
        performTest("parser/uniformVariableSyntax_04");
    }

    public void testUniformVariableSyntax_05() throws Exception {
        performTest("parser/uniformVariableSyntax_05");
    }

    public void testUniformVariableSyntax_06() throws Exception {
        performTest("parser/uniformVariableSyntax_06");
    }

    public void testUniformVariableSyntax_07() throws Exception {
        performTest("parser/uniformVariableSyntax_07");
    }

    public void testUniformVariableSyntax_08() throws Exception {
        performTest("parser/uniformVariableSyntax_08");
    }

    public void testUniformVariableSyntax_09() throws Exception {
        performTest("parser/uniformVariableSyntax_09");
    }

    public void testUniformVariableSyntax_10() throws Exception {
        performTest("parser/uniformVariableSyntax_10");
    }

    public void testUniformVariableSyntax_11() throws Exception {
        performTest("parser/uniformVariableSyntax_11");
    }

    public void testUniformVariableSyntax_12() throws Exception {
        performTest("parser/uniformVariableSyntax_12");
    }

    public void testUniformVariableSyntax_13() throws Exception {
        performTest("parser/uniformVariableSyntax_13");
    }

    public void testUniformVariableSyntax_14() throws Exception {
        performTest("parser/uniformVariableSyntax_14");
    }

    // incorrect AST (pre php7)
    public void testUniformVariableSyntax_15() throws Exception {
        performTest("parser/uniformVariableSyntax_15");
    }

    // incorrect AST (pre php7)
    public void testUniformVariableSyntax_16() throws Exception {
        performTest("parser/uniformVariableSyntax_16");
    }

    public void testUniformVariableSyntax_17() throws Exception {
        performTest("parser/uniformVariableSyntax_17");
    }

    public void testUniformVariableSyntax_18() throws Exception {
        performTest("parser/uniformVariableSyntax_18");
    }

    public void testUniformVariableSyntax_19() throws Exception {
        performTest("parser/uniformVariableSyntax_19");
    }

    public void testUniformVariableSyntax_20() throws Exception {
        performTest("parser/uniformVariableSyntax_20");
    }

    // #262141
    public void testUniformVariableSyntax_21() throws Exception {
        performTest("parser/uniformVariableSyntax_21");
    }

    // #262141
    public void testUniformVariableSyntax_22() throws Exception {
        performTest("parser/uniformVariableSyntax_22");
    }

    public void testUniformVariableSyntax_23() throws Exception {
        performTest("parser/uniformVariableSyntax_23");
    }

    public void testUniformVariableSyntax_24() throws Exception {
        performTest("parser/uniformVariableSyntax_24");
    }

    public void testUniformVariableSyntax_25() throws Exception {
        performTest("parser/uniformVariableSyntax_25");
    }

    public void testUniformVariableSyntax_26() throws Exception {
        performTest("parser/uniformVariableSyntax_26");
    }

    public void testUniformVariableSyntax_27() throws Exception {
        performTest("parser/uniformVariableSyntax_27");
    }

    public void testUniformVariableSyntax_28() throws Exception {
        performTest("parser/uniformVariableSyntax_28");
    }

    public void testUniformVariableSyntax_29() throws Exception {
        performTest("parser/uniformVariableSyntax_29");
    }

    public void testUniformVariableSyntax_30() throws Exception {
        performTest("parser/uniformVariableSyntax_30");
    }

    public void testUniformVariableSyntax_31() throws Exception {
        performTest("parser/uniformVariableSyntax_31");
    }

    public void testUniformVariableSyntax_32() throws Exception {
        performTest("parser/uniformVariableSyntax_32");
    }

    public void testUniformVariableSyntax_33() throws Exception {
        performTest("parser/uniformVariableSyntax_33");
    }

    // #262141
    public void testUniformVariableSyntax_34() throws Exception {
        // ... -> ... (->|::)
        performTest("parser/uniformVariableSyntax_34");
    }

    public void testUniformVariableSyntax_35() throws Exception {
        // ... :: ... (->|::)
        performTest("parser/uniformVariableSyntax_35");
    }

    public void testUniformVariableSyntax_36() throws Exception {
        // dereferencable
        performTest("parser/uniformVariableSyntax_36");
    }

    public void testUniformVariableSyntax_37() throws Exception {
        // [$object1, $object2][0]->property;
        performTest("parser/uniformVariableSyntax_37");
    }

    public void testCloneExpression_01() throws Exception {
        performTest("parser/cloneExpression_01");
    }

    public void testGroupUse_01() throws Exception {
        performTest("parser/groupUse_01");
    }

    public void testGroupUse_02() throws Exception {
        performTest("parser/groupUse_02");
    }

    public void testGroupUse_03() throws Exception {
        performTest("parser/groupUse_03");
    }

    public void testGroupUse_04() throws Exception {
        performTest("parser/groupUse_04");
    }

    public void testIssue258959() throws Exception {
        performTest("parser/issue258959");
    }

    public void testIssue268496_01() throws Exception {
        performTest("parser/issue268496_01");
    }

    public void testIssue268712() throws Exception {
        performTest("parser/issue268712");
    }

    public void testIssue262144() throws Exception {
        // yeild and yield from expressions for PHP7
        performTest("parser/issue262144");
    }

    // PHP7.1
    public void testNullableTypes_01() throws Exception {
        performTest("parser/nullableTypes_01");
    }

    public void testNullableTypes_02() throws Exception {
        performTest("parser/nullableTypes_02");
    }

    public void testNullableTypes_03() throws Exception {
        performTest("parser/nullableTypes_03");
    }

    public void testMultiCatchInFirstCatchClause() throws Exception {
        performTest("parser/multiCatchInFirstCatchClause");
    }

    public void testMultiCatchInSecondCatchClause() throws Exception {
        performTest("parser/multiCatchInSecondCatchClause");
    }

    public void testMultiCatchWithFinally() throws Exception {
        performTest("parser/multiCatchWithFinally");
    }

    public void testClassConstantVisibility_01() throws Exception {
        performTest("parser/classConstantVisibility_01");
    }

    public void testKeyedList_01() throws Exception {
        performTest("parser/keyedList_01");
    }

    public void testSymmetricArrayDestructuring_01() throws Exception {
        performTest("parser/symmetricArrayDestructuring_01");
    }

    public void testIssue269707() throws Exception {
        performTest("parser/issue269707");
    }

    // #262141 PHP7.0
    public void testContextSensitiveLexer_01() throws Exception {
        performTest("parser/contextSensitiveLexer_01");
    }

    public void testContextSensitiveLexer_02() throws Exception {
        performTest("parser/contextSensitiveLexer_02");
    }

    public void testContextSensitiveLexer_03() throws Exception {
        performTest("parser/contextSensitiveLexer_03");
    }

    public void testContextSensitiveLexer_04() throws Exception {
        performTest("parser/contextSensitiveLexer_04");
    }

    public void testContextSensitiveLexer_05() throws Exception {
        performTest("parser/contextSensitiveLexer_05");
    }

    public void testContextSensitiveLexerWithConstVisibility_01() throws Exception {
        performTest("parser/contextSensitiveLexerWithConstVisibility_01");
    }

    public void testIssue271109() throws Exception {
        // PHP7
        performTest("parser/issue271109");
    }

    @Override
    protected String getTestResult(String filename) throws Exception {
        // the same <Comment /> is shown twice becase the scanner is used twice
        File testFile = new File(getDataDir(), "testfiles/" + filename + ".php");
        StringBuilder result = new StringBuilder();
        String content = PHPLexerUtils.getFileContent(testFile);
        ASTPHP5Scanner scanner = new ASTPHP5Scanner(new StringReader(content));

        Symbol symbol;
        result.append("<testresult testFile='").append(testFile.getName()).append("'>\n");
        result.append("    <scanner>\n");
        do {
            symbol = scanner.next_token();
            result.append("        <token id='").append(Utils.getASTScannerTokenName(symbol.sym)).append("' start='");
            result.append(symbol.left).append("' end='").append(symbol.right).append("'>\n");
            result.append("            <text>");
            result.append(PHPLexerUtils.getXmlStringValue(content.substring(symbol.left, symbol.right)));
            result.append("</text>\n");
            result.append("        </token>\n");
        } while (symbol.sym != ASTPHP5Symbols.EOF);
        result.append("    </scanner>\n");

        scanner.reset(new FileReader(testFile));
        ASTPHP5Parser parser = new ASTPHP5Parser(scanner);
        Symbol root = parser.parse();
        if (root != null){
            Program rootnode = (Program)root.value;

            result.append((new PrintASTVisitor()).printTree(rootnode, 1));
        }
        result.append("</testresult>\n");
        return result.toString();
    }
}
