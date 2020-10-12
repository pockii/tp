package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.commons.core.Messages.MESSAGE_TAGS_LISTED_OVERVIEW;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.TypicalPersons.getTypicalProjact;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
import seedu.address.model.tag.TagName;
import seedu.address.model.tag.TagNameContainsKeywordsPredicate;

public class TagFindCommandTest {

    private Model model = new ModelManager(getTypicalProjact(), new UserPrefs());
    private Model expectedModel = new ModelManager(getTypicalProjact(), new UserPrefs());

    @Test
    public void equals() {
        TagNameContainsKeywordsPredicate firstPredicate =
                new TagNameContainsKeywordsPredicate(Collections.singletonList("first"));
        TagNameContainsKeywordsPredicate secondPredicate =
                new TagNameContainsKeywordsPredicate(Collections.singletonList("second"));

        TagFindCommand findFirstCommand = new TagFindCommand(firstPredicate);
        TagFindCommand findSecondCommand = new TagFindCommand(secondPredicate);

        // same object -> returns true
        assertTrue(findFirstCommand.equals(findFirstCommand));

        // same values -> returns true
        TagFindCommand findFirstCommandCopy = new TagFindCommand(firstPredicate);
        assertTrue(findFirstCommand.equals(findFirstCommandCopy));

        // different types -> returns false
        assertFalse(findFirstCommand.equals(1));

        // null -> returns false
        assertFalse(findFirstCommand.equals(null));

        // different tag -> returns false
        assertFalse(findFirstCommand.equals(findSecondCommand));
    }

    @Test
    public void execute_zeroKeywords_noTagFound() {
        String expectedMessage = String.format(MESSAGE_TAGS_LISTED_OVERVIEW, 0);
        TagNameContainsKeywordsPredicate predicate = preparePredicate(" ");
        TagFindCommand command = new TagFindCommand(predicate);
        expectedModel.updateFilteredTagList(predicate);
        assertCommandSuccess(command, model, expectedMessage, expectedModel);
        assertEquals(Collections.emptyList(), model.getFilteredTagList());
    }

    @Test
    public void execute_multipleKeywords_multipleTagsFound() {
        String expectedMessage = String.format(MESSAGE_TAGS_LISTED_OVERVIEW, 2);
        TagNameContainsKeywordsPredicate predicate = preparePredicate("FriEndS owesMoney");
        TagFindCommand command = new TagFindCommand(predicate);
        expectedModel.updateFilteredTagList(predicate);
        assertCommandSuccess(command, model, expectedMessage, expectedModel);
        assertEquals(Arrays.asList(new TagName("owesMoney"), new TagName("friends")), model.getFilteredTagList());
    }

    /**
     * Parses {@code userInput} into a {@code TagNameContainsKeywordsPredicate}.
     */
    private TagNameContainsKeywordsPredicate preparePredicate(String userInput) {
        return new TagNameContainsKeywordsPredicate(Arrays.asList(userInput.split("\\s+")));
    }

}
