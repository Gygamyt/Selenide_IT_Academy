package com.it_academy.selenide_rebuild_it_academy.onliner;


import com.it_academy.selenide_rebuild_it_academy.BaseTest;
import com.it_academy.selenide_rebuild_it_academy.utils.LinksForTestsEnum;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;


public class OnlinerBaseTest extends BaseTest {

    @BeforeEach
    public void openOnliner() {
        open(LinksForTestsEnum.ONLINER.getLink());
        logger().info("site is opened");
    }
}
