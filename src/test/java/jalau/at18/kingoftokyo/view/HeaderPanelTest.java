package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;

import java.awt.BorderLayout;

import jalau.at18.kingoftokyo.view.general.FooterPanel;
import jalau.at18.kingoftokyo.view.general.HeaderPanel;
import jalau.at18.kingoftokyo.view.general.MonsterLabel;
import jalau.at18.kingoftokyo.view.general.UsernameLabel;
import jalau.at18.kingoftokyo.view.general.UsernameTextBox;

import org.junit.Test;

public class HeaderPanelTest {
    @Test
    public void shouldShowHeaderPanel() {
        HeaderPanel headerPanel = new HeaderPanel();
        assertEquals(1, headerPanel.getComponentCount());
        assertEquals(100, headerPanel.getWidth());
        assertEquals(100, headerPanel.getHeight());
    }

    @Test
    public void shouldShowFooterPanel() {
        FooterPanel footerPanel = new FooterPanel();
        assertEquals(1, footerPanel.getComponentCount());

    }

    @Test
    public void shouldShowMonsterLabel() {
        MonsterLabel monsterLabel = new MonsterLabel();
        assertEquals("Serif.bold", monsterLabel.getFont().getFontName());
        assertEquals(18, monsterLabel.getFont().getSize());
        assertEquals(true, monsterLabel.isFontSet());

    }

    @Test
    public void shouldShowUserNameLabel() {
        UsernameLabel usernameLabel = new UsernameLabel();
        assertEquals("Serif.bold", usernameLabel.getFont().getFontName());
        assertEquals(18, usernameLabel.getFont().getSize());
        assertEquals(true, usernameLabel.isFontSet());

    }

    @Test
    public void shouldShowUsernameTextBox() {
        UsernameTextBox usernameTextBox = new UsernameTextBox();
        assertEquals("Serif.plain", usernameTextBox.getFont().getFontName());
        assertEquals(18, usernameTextBox.getFont().getSize());
        assertEquals(true, usernameTextBox.isFontSet());

    }
}