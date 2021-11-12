package siteparsers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WikipediaParserTest {

    private static WikipediaParser parser;

    @Before
    public void setUp() {
        parser = new WikipediaParser();
    }

    @Test
    public void testParseHtml() {
        // given
        String html = "<p><b>MohandasKaramchandGandhi</b>(<spanclass=\"rt-commentedText nowrap\"><spanclass=\"IPA nopopups noexcerpt\"><ahref=\"/wiki/Help:IPA/English\"title=\"Help:IPA/English\">/<spanstyle=\"border-bottom:1px dotted\"><spantitle=\"/ˈ/: primary stress follows\">ˈ</span><spantitle=\"/ɡ/: &#39;g&#39; in &#39;guy&#39;\">ɡ</span><spantitle=\"/ɑː/: &#39;a&#39; in &#39;father&#39;\">ɑː</span><spantitle=\"&#39;n&#39; in &#39;nigh&#39;\">n</span><spantitle=\"&#39;d&#39; in &#39;dye&#39;\">d</span><spantitle=\"/i/: &#39;y&#39; in &#39;happy&#39;\">i</span></span>,<spanclass=\"wrap\"></span><spanstyle=\"border-bottom:1px dotted\"><spantitle=\"/ˈ/: primary stress follows\">ˈ</span><spantitle=\"/ɡ/: &#39;g&#39; in &#39;guy&#39;\">ɡ</span><spantitle=\"/æ/: &#39;a&#39; in &#39;bad&#39;\">æ</span><spantitle=\"&#39;n&#39; in &#39;nigh&#39;\">n</span><spantitle=\"&#39;d&#39; in &#39;dye&#39;\">d</span><spantitle=\"/i/: &#39;y&#39; in &#39;happy&#39;\">i</span></span>/</a></span></span>;<supid=\"cite_ref-2\"class=\"reference\"><ahref=\"#cite_note-2\">&#91;2&#93;</a></sup>2October1869&#160;–30January1948)wasanIndianlawyer,<supid=\"cite_ref-3\"class=\"reference\"><ahref=\"#cite_note-3\">&#91;3&#93;</a></sup><ahref=\"/wiki/Anti-colonial_nationalism\"class=\"mw-redirect\"title=\"Anti-colonial nationalism\">anti-colonialnationalist</a><supid=\"cite_ref-GangulyDocker20082_4-0\"class=\"reference\"><ahref=\"#cite_note-GangulyDocker20082-4\">&#91;4&#93;</a></sup>and<ahref=\"/wiki/Political_ethics\"title=\"Political ethics\">politicalethicist</a><supid=\"cite_ref-Parel20162_5-0\"class=\"reference\"><ahref=\"#cite_note-Parel20162-5\">&#91;5&#93;</a></sup>whoemployed<ahref=\"/wiki/Nonviolent_resistance\"title=\"Nonviolent resistance\">nonviolentresistance</a>toleadthesuccessful<ahref=\"/wiki/Indian_independence_movement\"title=\"Indian independence movement\">campaignforIndia's independence</a> from <a href=\"/wiki/British_Raj\" title=\"British Raj\">British rule</a><sup id=\"cite_ref-Stein20102_6-0\" class=\"reference\"><a href=\"#cite_note-Stein20102-6\">&#91;6&#93;</a></sup> and in turn to inspire movements for <a href=\"/wiki/Civil_rights_movements\" title=\"Civil rights movements\">civil rights</a> and freedom across the world. The honorific <b><a href=\"/wiki/Mah%C4%81tm%C4%81\" title=\"Mahātmā\">Mahātmā</a></b> (<a href=\"/wiki/Sanskrit\" title=\"Sanskrit\">Sanskrit</a>: \"great-souled\", \"venerable\"), first applied to him in 1914 in South Africa, is now used throughout the world.<sup id=\"cite_ref-McGregor19932_7-0\" class=\"reference\"><a href=\"#cite_note-McGregor19932-7\">&#91;7&#93;</a></sup><sup id=\"cite_ref-rajmohan_gandhi_p1722_8-0\" class=\"reference\"><a href=\"#cite_note-rajmohan_gandhi_p1722-8\">&#91;8&#93;</a></sup> </p>";
        String expectedContent = "MohandasKaramchandGandhi(/ˈɡɑːndi,ˈɡændi/;[2]2October1869 –30January1948)wasanIndianlawyer,[3]anti-colonialnationalist[4]andpoliticalethicist[5]whoemployednonviolentresistancetoleadthesuccessfulcampaignforIndia's independence from British rule[6] and in turn to inspire movements for civil rights and freedom across the world. The honorific Mahātmā (Sanskrit: \"great-souled\", \"venerable\"), first applied to him in 1914 in South Africa, is now used throughout the world.[7][8]";

        //when
        String actualContent = parser.parseHtml(html);

        //then
        assertEquals(expectedContent, actualContent);

    }
}