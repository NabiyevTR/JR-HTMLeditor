package com.javarush.task.task32.task3209.actions;

import javax.swing.*;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StrikeThroughAction extends StyledEditorKit.StyledTextAction {

    public StrikeThroughAction() {
        super(StyleConstants.StrikeThrough.toString());
    }

    public void actionPerformed(ActionEvent actionEvent) {
        JEditorPane editor = getEditor(actionEvent);
        if (editor != null) {
            MutableAttributeSet mutableAttributeSet = getStyledEditorKit(editor).getInputAttributes();
            SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
            StyleConstants.setStrikeThrough(simpleAttributeSet, !StyleConstants.isStrikeThrough(mutableAttributeSet));
            setCharacterAttributes(editor, simpleAttributeSet, false);
        }
    }

    /*


12.3. Изучи реализацию класса StrikeThroughAction, которую ты получил вместе с заданием и реализуй аналогичным образом классы:
12.3.1. SubscriptAction
12.3.2. SuperscriptAction
Запусти программу и убедись, что пункты меню Подстрочный знак, Надстрочный знак и Зачеркнутый работают.
Пункты, отвечающие за отмену и возврат действия пока не подключены к контроллеру и мы не сможем их проверить.


     */
}
