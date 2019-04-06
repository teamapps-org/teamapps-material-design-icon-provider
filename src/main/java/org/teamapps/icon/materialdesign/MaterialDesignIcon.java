/*-
 * ========================LICENSE_START=================================
 * TeamApps Font Awesome Icon Provider
 * ---
 * Copyright (C) 2014 - 2019 TeamApps.org
 * ---
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package org.teamapps.icon.materialdesign;

import org.teamapps.icons.api.Icon;
import org.teamapps.icons.api.SimpleIcon;
import org.teamapps.icons.api.StyledIcon;

public enum MaterialDesignIcon {
	//Grouped in sup enums as Java does not support more than 2750 enums per class
	;

	public enum CELLPHONE implements SimpleIcon {
		ANDROID("cellphone-android.svg"),
		ARROW_DOWN("cellphone-arrow-down.svg"),
		BASIC("cellphone-basic.svg"),
		DOCK("cellphone-dock.svg"),
		ERASE("cellphone-erase.svg"),
		IPHONE("cellphone-iphone.svg"),
		KEY("cellphone-key.svg"),
		LINK_OFF("cellphone-link-off.svg"),
		LINK("cellphone-link.svg"),
		LOCK("cellphone-lock.svg"),
		MESSAGE("cellphone-message.svg"),
		OFF("cellphone-off.svg"),
		SCREENSHOT("cellphone-screenshot.svg"),
		SETTINGS_VARIANT("cellphone-settings-variant.svg"),
		SETTINGS("cellphone-settings.svg"),
		SOUND("cellphone-sound.svg"),
		TEXT("cellphone-text.svg"),
		WIRELESS("cellphone-wireless.svg"),
		;
		private String name;

		CELLPHONE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CHECKBOX implements SimpleIcon {
		BLANK_CIRCLE_OUTLINE("checkbox-blank-circle-outline.svg"),
		BLANK_CIRCLE("checkbox-blank-circle.svg"),
		BLANK_OUTLINE("checkbox-blank-outline.svg"),
		BLANK("checkbox-blank.svg"),
		INDETERMINATE("checkbox-indeterminate.svg"),
		MARKED_CIRCLE_OUTLINE("checkbox-marked-circle-outline.svg"),
		MARKED_CIRCLE("checkbox-marked-circle.svg"),
		MARKED_OUTLINE("checkbox-marked-outline.svg"),
		MARKED("checkbox-marked.svg"),
		MULTIPLE_BLANK_CIRCLE_OUTLINE("checkbox-multiple-blank-circle-outline.svg"),
		MULTIPLE_BLANK_CIRCLE("checkbox-multiple-blank-circle.svg"),
		MULTIPLE_BLANK_OUTLINE("checkbox-multiple-blank-outline.svg"),
		MULTIPLE_BLANK("checkbox-multiple-blank.svg"),
		MULTIPLE_MARKED_CIRCLE_OUTLINE("checkbox-multiple-marked-circle-outline.svg"),
		MULTIPLE_MARKED_CIRCLE("checkbox-multiple-marked-circle.svg"),
		MULTIPLE_MARKED_OUTLINE("checkbox-multiple-marked-outline.svg"),
		MULTIPLE_MARKED("checkbox-multiple-marked.svg"),
		;
		private String name;

		CHECKBOX(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum FORMAT implements SimpleIcon {
		ALIGN_BOTTOM("format-align-bottom.svg"),
		ALIGN_CENTER("format-align-center.svg"),
		ALIGN_JUSTIFY("format-align-justify.svg"),
		ALIGN_LEFT("format-align-left.svg"),
		ALIGN_MIDDLE("format-align-middle.svg"),
		ALIGN_RIGHT("format-align-right.svg"),
		ALIGN_TOP("format-align-top.svg"),
		ANNOTATION_MINUS("format-annotation-minus.svg"),
		ANNOTATION_PLUS("format-annotation-plus.svg"),
		BOLD("format-bold.svg"),
		CLEAR("format-clear.svg"),
		COLOR_FILL("format-color-fill.svg"),
		COLOR_TEXT("format-color-text.svg"),
		COLOR("format-color.svg"),
		COLUMNS("format-columns.svg"),
		FLOAT_CENTER("format-float-center.svg"),
		FLOAT_LEFT("format-float-left.svg"),
		FLOAT_NONE("format-float-none.svg"),
		FLOAT_RIGHT("format-float-right.svg"),
		FONT_SIZE_DECREASE("format-font-size-decrease.svg"),
		FONT_SIZE_INCREASE("format-font-size-increase.svg"),
		FONT("format-font.svg"),
		HEADER_1("format-header-1.svg"),
		HEADER_2("format-header-2.svg"),
		HEADER_3("format-header-3.svg"),
		HEADER_4("format-header-4.svg"),
		HEADER_5("format-header-5.svg"),
		HEADER_6("format-header-6.svg"),
		HEADER_DECREASE("format-header-decrease.svg"),
		HEADER_DOWN("format-header-down.svg"),
		HEADER_EQUAL("format-header-equal.svg"),
		HEADER_INCREASE("format-header-increase.svg"),
		HEADER_POUND("format-header-pound.svg"),
		HEADER_UP("format-header-up.svg"),
		HORIZONTAL_ALIGN_CENTER("format-horizontal-align-center.svg"),
		HORIZONTAL_ALIGN_LEFT("format-horizontal-align-left.svg"),
		HORIZONTAL_ALIGN_RIGHT("format-horizontal-align-right.svg"),
		INDENT_DECREASE("format-indent-decrease.svg"),
		INDENT_INCREASE("format-indent-increase.svg"),
		ITALIC("format-italic.svg"),
		LETTER_CASE_LOWER("format-letter-case-lower.svg"),
		LETTER_CASE_UPPER("format-letter-case-upper.svg"),
		LETTER_CASE("format-letter-case.svg"),
		LINE_SPACING("format-line-spacing.svg"),
		LINE_STYLE("format-line-style.svg"),
		LINE_WEIGHT("format-line-weight.svg"),
		LIST_BULLETED_SQUARE("format-list-bulleted-square.svg"),
		LIST_BULLETED_TYPE("format-list-bulleted-type.svg"),
		LIST_BULLETED("format-list-bulleted.svg"),
		LIST_CHECKBOX("format-list-checkbox.svg"),
		LIST_CHECKS("format-list-checks.svg"),
		LIST_NUMBERED_RTL("format-list-numbered-rtl.svg"),
		LIST_NUMBERED("format-list-numbered.svg"),
		PAGE_BREAK("format-page-break.svg"),
		PAINT("format-paint.svg"),
		PARAGRAPH("format-paragraph.svg"),
		PILCROW("format-pilcrow.svg"),
		QUOTE_CLOSE("format-quote-close.svg"),
		QUOTE_OPEN("format-quote-open.svg"),
		ROTATE_90("format-rotate-90.svg"),
		SECTION("format-section.svg"),
		SIZE("format-size.svg"),
		STRIKETHROUGH_VARIANT("format-strikethrough-variant.svg"),
		STRIKETHROUGH("format-strikethrough.svg"),
		SUBSCRIPT("format-subscript.svg"),
		SUPERSCRIPT("format-superscript.svg"),
		TEXT_ROTATION_DOWN("format-text-rotation-down.svg"),
		TEXT_ROTATION_NONE("format-text-rotation-none.svg"),
		TEXT_WRAPPING_CLIP("format-text-wrapping-clip.svg"),
		TEXT_WRAPPING_OVERFLOW("format-text-wrapping-overflow.svg"),
		TEXT_WRAPPING_WRAP("format-text-wrapping-wrap.svg"),
		TEXT("format-text.svg"),
		TEXTBOX("format-textbox.svg"),
		TEXTDIRECTION_L_TO_R("format-textdirection-l-to-r.svg"),
		TEXTDIRECTION_R_TO_L("format-textdirection-r-to-l.svg"),
		TITLE("format-title.svg"),
		UNDERLINE("format-underline.svg"),
		VERTICAL_ALIGN_BOTTOM("format-vertical-align-bottom.svg"),
		VERTICAL_ALIGN_CENTER("format-vertical-align-center.svg"),
		VERTICAL_ALIGN_TOP("format-vertical-align-top.svg"),
		WRAP_INLINE("format-wrap-inline.svg"),
		WRAP_SQUARE("format-wrap-square.svg"),
		WRAP_TIGHT("format-wrap-tight.svg"),
		WRAP_TOP_BOTTOM("format-wrap-top-bottom.svg"),
		;
		private String name;

		FORMAT(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum VIDEO implements SimpleIcon {
		_3D("video-3d.svg"),
		_4K_BOX("video-4k-box.svg"),
		ACCOUNT("video-account.svg"),
		IMAGE("video-image.svg"),
		INPUT_ANTENNA("video-input-antenna.svg"),
		INPUT_COMPONENT("video-input-component.svg"),
		INPUT_HDMI("video-input-hdmi.svg"),
		INPUT_SVIDEO("video-input-svideo.svg"),
		MINUS("video-minus.svg"),
		OFF_OUTLINE("video-off-outline.svg"),
		OFF("video-off.svg"),
		OUTLINE("video-outline.svg"),
		PLUS("video-plus.svg"),
		STABILIZATION("video-stabilization.svg"),
		SWITCH("video-switch.svg"),
		VINTAGE("video-vintage.svg"),
		;
		private String name;

		VIDEO(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum DICE implements SimpleIcon {
		_1("dice-1.svg"),
		_2("dice-2.svg"),
		_3("dice-3.svg"),
		_4("dice-4.svg"),
		_5("dice-5.svg"),
		_6("dice-6.svg"),
		D10("dice-d10.svg"),
		D12("dice-d12.svg"),
		D20("dice-d20.svg"),
		D4("dice-d4.svg"),
		D6("dice-d6.svg"),
		D8("dice-d8.svg"),
		MULTIPLE("dice-multiple.svg"),
		;
		private String name;

		DICE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum EMOTICON implements SimpleIcon {
		ANGRY_OUTLINE("emoticon-angry-outline.svg"),
		ANGRY("emoticon-angry.svg"),
		COOL_OUTLINE("emoticon-cool-outline.svg"),
		COOL("emoticon-cool.svg"),
		CRY_OUTLINE("emoticon-cry-outline.svg"),
		CRY("emoticon-cry.svg"),
		DEAD_OUTLINE("emoticon-dead-outline.svg"),
		DEAD("emoticon-dead.svg"),
		DEVIL_OUTLINE("emoticon-devil-outline.svg"),
		DEVIL("emoticon-devil.svg"),
		EXCITED_OUTLINE("emoticon-excited-outline.svg"),
		EXCITED("emoticon-excited.svg"),
		HAPPY_OUTLINE("emoticon-happy-outline.svg"),
		HAPPY("emoticon-happy.svg"),
		KISS_OUTLINE("emoticon-kiss-outline.svg"),
		KISS("emoticon-kiss.svg"),
		NEUTRAL_OUTLINE("emoticon-neutral-outline.svg"),
		NEUTRAL("emoticon-neutral.svg"),
		OUTLINE("emoticon-outline.svg"),
		POOP_OUTLINE("emoticon-poop-outline.svg"),
		POOP("emoticon-poop.svg"),
		SAD_OUTLINE("emoticon-sad-outline.svg"),
		SAD("emoticon-sad.svg"),
		TONGUE_OUTLINE("emoticon-tongue-outline.svg"),
		TONGUE("emoticon-tongue.svg"),
		WINK_OUTLINE("emoticon-wink-outline.svg"),
		WINK("emoticon-wink.svg"),
		;
		private String name;

		EMOTICON(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CHEVRON implements SimpleIcon {
		DOUBLE_DOWN("chevron-double-down.svg"),
		DOUBLE_LEFT("chevron-double-left.svg"),
		DOUBLE_RIGHT("chevron-double-right.svg"),
		DOUBLE_UP("chevron-double-up.svg"),
		DOWN_BOX_OUTLINE("chevron-down-box-outline.svg"),
		DOWN_BOX("chevron-down-box.svg"),
		DOWN_CIRCLE_OUTLINE("chevron-down-circle-outline.svg"),
		DOWN_CIRCLE("chevron-down-circle.svg"),
		DOWN("chevron-down.svg"),
		LEFT_BOX_OUTLINE("chevron-left-box-outline.svg"),
		LEFT_BOX("chevron-left-box.svg"),
		LEFT_CIRCLE_OUTLINE("chevron-left-circle-outline.svg"),
		LEFT_CIRCLE("chevron-left-circle.svg"),
		LEFT("chevron-left.svg"),
		RIGHT_BOX_OUTLINE("chevron-right-box-outline.svg"),
		RIGHT_BOX("chevron-right-box.svg"),
		RIGHT_CIRCLE_OUTLINE("chevron-right-circle-outline.svg"),
		RIGHT_CIRCLE("chevron-right-circle.svg"),
		RIGHT("chevron-right.svg"),
		TRIPLE_DOWN("chevron-triple-down.svg"),
		TRIPLE_LEFT("chevron-triple-left.svg"),
		TRIPLE_RIGHT("chevron-triple-right.svg"),
		TRIPLE_UP("chevron-triple-up.svg"),
		UP_BOX_OUTLINE("chevron-up-box-outline.svg"),
		UP_BOX("chevron-up-box.svg"),
		UP_CIRCLE_OUTLINE("chevron-up-circle-outline.svg"),
		UP_CIRCLE("chevron-up-circle.svg"),
		UP("chevron-up.svg"),
		;
		private String name;

		CHEVRON(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum LOCK implements SimpleIcon {
		ALERT("lock-alert.svg"),
		CLOCK("lock-clock.svg"),
		OPEN_OUTLINE("lock-open-outline.svg"),
		OPEN("lock-open.svg"),
		OUTLINE("lock-outline.svg"),
		PATTERN("lock-pattern.svg"),
		PLUS("lock-plus.svg"),
		QUESTION("lock-question.svg"),
		RESET("lock-reset.svg"),
		SMART("lock-smart.svg"),
		;
		private String name;

		LOCK(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum ALPHA implements SimpleIcon {
		A_BOX_OUTLINE("alpha-a-box-outline.svg"),
		A_BOX("alpha-a-box.svg"),
		A_CIRCLE_OUTLINE("alpha-a-circle-outline.svg"),
		A_CIRCLE("alpha-a-circle.svg"),
		A("alpha-a.svg"),
		B_BOX_OUTLINE("alpha-b-box-outline.svg"),
		B_BOX("alpha-b-box.svg"),
		B_CIRCLE_OUTLINE("alpha-b-circle-outline.svg"),
		B_CIRCLE("alpha-b-circle.svg"),
		B("alpha-b.svg"),
		C_BOX_OUTLINE("alpha-c-box-outline.svg"),
		C_BOX("alpha-c-box.svg"),
		C_CIRCLE_OUTLINE("alpha-c-circle-outline.svg"),
		C_CIRCLE("alpha-c-circle.svg"),
		C("alpha-c.svg"),
		D_BOX_OUTLINE("alpha-d-box-outline.svg"),
		D_BOX("alpha-d-box.svg"),
		D_CIRCLE_OUTLINE("alpha-d-circle-outline.svg"),
		D_CIRCLE("alpha-d-circle.svg"),
		D("alpha-d.svg"),
		E_BOX_OUTLINE("alpha-e-box-outline.svg"),
		E_BOX("alpha-e-box.svg"),
		E_CIRCLE_OUTLINE("alpha-e-circle-outline.svg"),
		E_CIRCLE("alpha-e-circle.svg"),
		E("alpha-e.svg"),
		F_BOX_OUTLINE("alpha-f-box-outline.svg"),
		F_BOX("alpha-f-box.svg"),
		F_CIRCLE_OUTLINE("alpha-f-circle-outline.svg"),
		F_CIRCLE("alpha-f-circle.svg"),
		F("alpha-f.svg"),
		G_BOX_OUTLINE("alpha-g-box-outline.svg"),
		G_BOX("alpha-g-box.svg"),
		G_CIRCLE_OUTLINE("alpha-g-circle-outline.svg"),
		G_CIRCLE("alpha-g-circle.svg"),
		G("alpha-g.svg"),
		H_BOX_OUTLINE("alpha-h-box-outline.svg"),
		H_BOX("alpha-h-box.svg"),
		H_CIRCLE_OUTLINE("alpha-h-circle-outline.svg"),
		H_CIRCLE("alpha-h-circle.svg"),
		H("alpha-h.svg"),
		I_BOX_OUTLINE("alpha-i-box-outline.svg"),
		I_BOX("alpha-i-box.svg"),
		I_CIRCLE_OUTLINE("alpha-i-circle-outline.svg"),
		I_CIRCLE("alpha-i-circle.svg"),
		I("alpha-i.svg"),
		J_BOX_OUTLINE("alpha-j-box-outline.svg"),
		J_BOX("alpha-j-box.svg"),
		J_CIRCLE_OUTLINE("alpha-j-circle-outline.svg"),
		J_CIRCLE("alpha-j-circle.svg"),
		J("alpha-j.svg"),
		K_BOX_OUTLINE("alpha-k-box-outline.svg"),
		K_BOX("alpha-k-box.svg"),
		K_CIRCLE_OUTLINE("alpha-k-circle-outline.svg"),
		K_CIRCLE("alpha-k-circle.svg"),
		K("alpha-k.svg"),
		L_BOX_OUTLINE("alpha-l-box-outline.svg"),
		L_BOX("alpha-l-box.svg"),
		L_CIRCLE_OUTLINE("alpha-l-circle-outline.svg"),
		L_CIRCLE("alpha-l-circle.svg"),
		L("alpha-l.svg"),
		M_BOX_OUTLINE("alpha-m-box-outline.svg"),
		M_BOX("alpha-m-box.svg"),
		M_CIRCLE_OUTLINE("alpha-m-circle-outline.svg"),
		M_CIRCLE("alpha-m-circle.svg"),
		M("alpha-m.svg"),
		N_BOX_OUTLINE("alpha-n-box-outline.svg"),
		N_BOX("alpha-n-box.svg"),
		N_CIRCLE_OUTLINE("alpha-n-circle-outline.svg"),
		N_CIRCLE("alpha-n-circle.svg"),
		N("alpha-n.svg"),
		O_BOX_OUTLINE("alpha-o-box-outline.svg"),
		O_BOX("alpha-o-box.svg"),
		O_CIRCLE_OUTLINE("alpha-o-circle-outline.svg"),
		O_CIRCLE("alpha-o-circle.svg"),
		O("alpha-o.svg"),
		P_BOX_OUTLINE("alpha-p-box-outline.svg"),
		P_BOX("alpha-p-box.svg"),
		P_CIRCLE_OUTLINE("alpha-p-circle-outline.svg"),
		P_CIRCLE("alpha-p-circle.svg"),
		P("alpha-p.svg"),
		Q_BOX_OUTLINE("alpha-q-box-outline.svg"),
		Q_BOX("alpha-q-box.svg"),
		Q_CIRCLE_OUTLINE("alpha-q-circle-outline.svg"),
		Q_CIRCLE("alpha-q-circle.svg"),
		Q("alpha-q.svg"),
		R_BOX_OUTLINE("alpha-r-box-outline.svg"),
		R_BOX("alpha-r-box.svg"),
		R_CIRCLE_OUTLINE("alpha-r-circle-outline.svg"),
		R_CIRCLE("alpha-r-circle.svg"),
		R("alpha-r.svg"),
		S_BOX_OUTLINE("alpha-s-box-outline.svg"),
		S_BOX("alpha-s-box.svg"),
		S_CIRCLE_OUTLINE("alpha-s-circle-outline.svg"),
		S_CIRCLE("alpha-s-circle.svg"),
		S("alpha-s.svg"),
		T_BOX_OUTLINE("alpha-t-box-outline.svg"),
		T_BOX("alpha-t-box.svg"),
		T_CIRCLE_OUTLINE("alpha-t-circle-outline.svg"),
		T_CIRCLE("alpha-t-circle.svg"),
		T("alpha-t.svg"),
		U_BOX_OUTLINE("alpha-u-box-outline.svg"),
		U_BOX("alpha-u-box.svg"),
		U_CIRCLE_OUTLINE("alpha-u-circle-outline.svg"),
		U_CIRCLE("alpha-u-circle.svg"),
		U("alpha-u.svg"),
		V_BOX_OUTLINE("alpha-v-box-outline.svg"),
		V_BOX("alpha-v-box.svg"),
		V_CIRCLE_OUTLINE("alpha-v-circle-outline.svg"),
		V_CIRCLE("alpha-v-circle.svg"),
		V("alpha-v.svg"),
		W_BOX_OUTLINE("alpha-w-box-outline.svg"),
		W_BOX("alpha-w-box.svg"),
		W_CIRCLE_OUTLINE("alpha-w-circle-outline.svg"),
		W_CIRCLE("alpha-w-circle.svg"),
		W("alpha-w.svg"),
		X_BOX_OUTLINE("alpha-x-box-outline.svg"),
		X_BOX("alpha-x-box.svg"),
		X_CIRCLE_OUTLINE("alpha-x-circle-outline.svg"),
		X_CIRCLE("alpha-x-circle.svg"),
		X("alpha-x.svg"),
		Y_BOX_OUTLINE("alpha-y-box-outline.svg"),
		Y_BOX("alpha-y-box.svg"),
		Y_CIRCLE_OUTLINE("alpha-y-circle-outline.svg"),
		Y_CIRCLE("alpha-y-circle.svg"),
		Y("alpha-y.svg"),
		Z_BOX_OUTLINE("alpha-z-box-outline.svg"),
		Z_BOX("alpha-z-box.svg"),
		Z_CIRCLE_OUTLINE("alpha-z-circle-outline.svg"),
		Z_CIRCLE("alpha-z-circle.svg"),
		Z("alpha-z.svg"),
		;
		private String name;

		ALPHA(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum ALERT implements SimpleIcon {
		BOX_OUTLINE("alert-box-outline.svg"),
		BOX("alert-box.svg"),
		CIRCLE_OUTLINE("alert-circle-outline.svg"),
		CIRCLE("alert-circle.svg"),
		DECAGRAM_OUTLINE("alert-decagram-outline.svg"),
		DECAGRAM("alert-decagram.svg"),
		OCTAGON_OUTLINE("alert-octagon-outline.svg"),
		OCTAGON("alert-octagon.svg"),
		OCTAGRAM_OUTLINE("alert-octagram-outline.svg"),
		OCTAGRAM("alert-octagram.svg"),
		OUTLINE("alert-outline.svg"),
		;
		private String name;

		ALERT(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum EMAIL implements SimpleIcon {
		ALERT("email-alert.svg"),
		BOX("email-box.svg"),
		CHECK_OUTLINE("email-check-outline.svg"),
		CHECK("email-check.svg"),
		LOCK("email-lock.svg"),
		MARK_AS_UNREAD("email-mark-as-unread.svg"),
		OPEN_OUTLINE("email-open-outline.svg"),
		OPEN("email-open.svg"),
		OUTLINE("email-outline.svg"),
		PLUS_OUTLINE("email-plus-outline.svg"),
		PLUS("email-plus.svg"),
		SEARCH_OUTLINE("email-search-outline.svg"),
		SEARCH("email-search.svg"),
		VARIANT("email-variant.svg"),
		;
		private String name;

		EMAIL(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum VIEW implements SimpleIcon {
		AGENDA("view-agenda.svg"),
		ARRAY("view-array.svg"),
		CAROUSEL("view-carousel.svg"),
		COLUMN("view-column.svg"),
		COMFY("view-comfy.svg"),
		COMPACT_OUTLINE("view-compact-outline.svg"),
		COMPACT("view-compact.svg"),
		DASHBOARD_OUTLINE("view-dashboard-outline.svg"),
		DASHBOARD_VARIANT("view-dashboard-variant.svg"),
		DASHBOARD("view-dashboard.svg"),
		DAY("view-day.svg"),
		GRID("view-grid.svg"),
		HEADLINE("view-headline.svg"),
		LIST("view-list.svg"),
		MODULE("view-module.svg"),
		PARALLEL("view-parallel.svg"),
		QUILT("view-quilt.svg"),
		SEQUENTIAL("view-sequential.svg"),
		STREAM("view-stream.svg"),
		WEEK("view-week.svg"),
		;
		private String name;

		VIEW(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum EYE implements SimpleIcon {
		CHECK_OUTLINE("eye-check-outline.svg"),
		CHECK("eye-check.svg"),
		CIRCLE_OUTLINE("eye-circle-outline.svg"),
		CIRCLE("eye-circle.svg"),
		OFF_OUTLINE("eye-off-outline.svg"),
		OFF("eye-off.svg"),
		OUTLINE("eye-outline.svg"),
		PLUS_OUTLINE("eye-plus-outline.svg"),
		PLUS("eye-plus.svg"),
		SETTINGS_OUTLINE("eye-settings-outline.svg"),
		SETTINGS("eye-settings.svg"),
		;
		private String name;

		EYE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum TABLE implements SimpleIcon {
		BORDER("table-border.svg"),
		COLUMN_PLUS_AFTER("table-column-plus-after.svg"),
		COLUMN_PLUS_BEFORE("table-column-plus-before.svg"),
		COLUMN_REMOVE("table-column-remove.svg"),
		COLUMN_WIDTH("table-column-width.svg"),
		COLUMN("table-column.svg"),
		EDIT("table-edit.svg"),
		LARGE("table-large.svg"),
		MERGE_CELLS("table-merge-cells.svg"),
		OF_CONTENTS("table-of-contents.svg"),
		PLUS("table-plus.svg"),
		REMOVE("table-remove.svg"),
		ROW_HEIGHT("table-row-height.svg"),
		ROW_PLUS_AFTER("table-row-plus-after.svg"),
		ROW_PLUS_BEFORE("table-row-plus-before.svg"),
		ROW_REMOVE("table-row-remove.svg"),
		ROW("table-row.svg"),
		SEARCH("table-search.svg"),
		SETTINGS("table-settings.svg"),
		TENNIS("table-tennis.svg"),
		;
		private String name;

		TABLE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum ZODIAC implements SimpleIcon {
		AQUARIUS("zodiac-aquarius.svg"),
		ARIES("zodiac-aries.svg"),
		CANCER("zodiac-cancer.svg"),
		CAPRICORN("zodiac-capricorn.svg"),
		GEMINI("zodiac-gemini.svg"),
		LEO("zodiac-leo.svg"),
		LIBRA("zodiac-libra.svg"),
		PISCES("zodiac-pisces.svg"),
		SAGITTARIUS("zodiac-sagittarius.svg"),
		SCORPIO("zodiac-scorpio.svg"),
		TAURUS("zodiac-taurus.svg"),
		VIRGO("zodiac-virgo.svg"),
		;
		private String name;

		ZODIAC(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum ACCOUNT implements SimpleIcon {
		ALERT_OUTLINE("account-alert-outline.svg"),
		ALERT("account-alert.svg"),
		ARROW_LEFT_OUTLINE("account-arrow-left-outline.svg"),
		ARROW_LEFT("account-arrow-left.svg"),
		ARROW_RIGHT_OUTLINE("account-arrow-right-outline.svg"),
		ARROW_RIGHT("account-arrow-right.svg"),
		BADGE_ALERT_OUTLINE("account-badge-alert-outline.svg"),
		BADGE_ALERT("account-badge-alert.svg"),
		BADGE_HORIZONTAL_OUTLINE("account-badge-horizontal-outline.svg"),
		BADGE_HORIZONTAL("account-badge-horizontal.svg"),
		BADGE_OUTLINE("account-badge-outline.svg"),
		BADGE("account-badge.svg"),
		BOX_MULTIPLE("account-box-multiple.svg"),
		BOX_OUTLINE("account-box-outline.svg"),
		BOX("account-box.svg"),
		CARD_DETAILS_OUTLINE("account-card-details-outline.svg"),
		CARD_DETAILS("account-card-details.svg"),
		CHECK_OUTLINE("account-check-outline.svg"),
		CHECK("account-check.svg"),
		CHILD_CIRCLE("account-child-circle.svg"),
		CHILD("account-child.svg"),
		CIRCLE_OUTLINE("account-circle-outline.svg"),
		CIRCLE("account-circle.svg"),
		CLOCK_OUTLINE("account-clock-outline.svg"),
		CLOCK("account-clock.svg"),
		CONVERT("account-convert.svg"),
		DETAILS("account-details.svg"),
		EDIT("account-edit.svg"),
		GROUP_OUTLINE("account-group-outline.svg"),
		GROUP("account-group.svg"),
		HEART_OUTLINE("account-heart-outline.svg"),
		HEART("account-heart.svg"),
		HELP_OUTLINE("account-help-outline.svg"),
		HELP("account-help.svg"),
		KEY_OUTLINE("account-key-outline.svg"),
		KEY("account-key.svg"),
		MINUS_OUTLINE("account-minus-outline.svg"),
		MINUS("account-minus.svg"),
		MULTIPLE_CHECK("account-multiple-check.svg"),
		MULTIPLE_MINUS_OUTLINE("account-multiple-minus-outline.svg"),
		MULTIPLE_MINUS("account-multiple-minus.svg"),
		MULTIPLE_OUTLINE("account-multiple-outline.svg"),
		MULTIPLE_PLUS_OUTLINE("account-multiple-plus-outline.svg"),
		MULTIPLE_PLUS("account-multiple-plus.svg"),
		MULTIPLE("account-multiple.svg"),
		NETWORK_OUTLINE("account-network-outline.svg"),
		NETWORK("account-network.svg"),
		OFF_OUTLINE("account-off-outline.svg"),
		OFF("account-off.svg"),
		OUTLINE("account-outline.svg"),
		PLUS_OUTLINE("account-plus-outline.svg"),
		PLUS("account-plus.svg"),
		REMOVE_OUTLINE("account-remove-outline.svg"),
		REMOVE("account-remove.svg"),
		SEARCH_OUTLINE("account-search-outline.svg"),
		SEARCH("account-search.svg"),
		SETTINGS_VARIANT("account-settings-variant.svg"),
		SETTINGS("account-settings.svg"),
		STAR_OUTLINE("account-star-outline.svg"),
		SUPERVISOR_CIRCLE("account-supervisor-circle.svg"),
		SUPERVISOR("account-supervisor.svg"),
		SWITCH("account-switch.svg"),
		TIE("account-tie.svg"),
		;
		private String name;

		ACCOUNT(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum HUMAN implements SimpleIcon {
		CHILD("human-child.svg"),
		FEMALE_BOY("human-female-boy.svg"),
		FEMALE_FEMALE("human-female-female.svg"),
		FEMALE_GIRL("human-female-girl.svg"),
		FEMALE("human-female.svg"),
		GREETING("human-greeting.svg"),
		HANDSDOWN("human-handsdown.svg"),
		HANDSUP("human-handsup.svg"),
		MALE_BOY("human-male-boy.svg"),
		MALE_FEMALE("human-male-female.svg"),
		MALE_GIRL("human-male-girl.svg"),
		MALE_MALE("human-male-male.svg"),
		MALE("human-male.svg"),
		PREGNANT("human-pregnant.svg"),
		;
		private String name;

		HUMAN(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum IMAGE implements SimpleIcon {
		ALBUM("image-album.svg"),
		AREA_CLOSE("image-area-close.svg"),
		AREA("image-area.svg"),
		BROKEN_VARIANT("image-broken-variant.svg"),
		BROKEN("image-broken.svg"),
		FILTER_BLACK_WHITE("image-filter-black-white.svg"),
		FILTER_CENTER_FOCUS_WEAK("image-filter-center-focus-weak.svg"),
		FILTER_CENTER_FOCUS("image-filter-center-focus.svg"),
		FILTER_DRAMA("image-filter-drama.svg"),
		FILTER_FRAMES("image-filter-frames.svg"),
		FILTER_HDR("image-filter-hdr.svg"),
		FILTER_NONE("image-filter-none.svg"),
		FILTER_TILT_SHIFT("image-filter-tilt-shift.svg"),
		FILTER_VINTAGE("image-filter-vintage.svg"),
		FILTER("image-filter.svg"),
		FRAME("image-frame.svg"),
		MOVE("image-move.svg"),
		MULTIPLE("image-multiple.svg"),
		OFF("image-off.svg"),
		OUTLINE("image-outline.svg"),
		PLUS("image-plus.svg"),
		SEARCH_OUTLINE("image-search-outline.svg"),
		SEARCH("image-search.svg"),
		SIZE_SELECT_ACTUAL("image-size-select-actual.svg"),
		SIZE_SELECT_LARGE("image-size-select-large.svg"),
		SIZE_SELECT_SMALL("image-size-select-small.svg"),
		;
		private String name;

		IMAGE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum BOOKMARK implements SimpleIcon {
		CHECK("bookmark-check.svg"),
		MINUS_OUTLINE("bookmark-minus-outline.svg"),
		MINUS("bookmark-minus.svg"),
		MULTIPLE_OUTLINE("bookmark-multiple-outline.svg"),
		MULTIPLE("bookmark-multiple.svg"),
		MUSIC("bookmark-music.svg"),
		OFF_OUTLINE("bookmark-off-outline.svg"),
		OFF("bookmark-off.svg"),
		OUTLINE("bookmark-outline.svg"),
		PLUS_OUTLINE("bookmark-plus-outline.svg"),
		PLUS("bookmark-plus.svg"),
		REMOVE("bookmark-remove.svg"),
		;
		private String name;

		BOOKMARK(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum BELL implements SimpleIcon {
		ALERT_OUTLINE("bell-alert-outline.svg"),
		ALERT("bell-alert.svg"),
		CIRCLE_OUTLINE("bell-circle-outline.svg"),
		CIRCLE("bell-circle.svg"),
		OFF_OUTLINE("bell-off-outline.svg"),
		OFF("bell-off.svg"),
		OUTLINE("bell-outline.svg"),
		PLUS_OUTLINE("bell-plus-outline.svg"),
		PLUS("bell-plus.svg"),
		RING_OUTLINE("bell-ring-outline.svg"),
		RING("bell-ring.svg"),
		SLEEP_OUTLINE("bell-sleep-outline.svg"),
		SLEEP("bell-sleep.svg"),
		;
		private String name;

		BELL(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum FOLDER implements SimpleIcon {
		ACCOUNT_OUTLINE("folder-account-outline.svg"),
		ACCOUNT("folder-account.svg"),
		ALERT_OUTLINE("folder-alert-outline.svg"),
		ALERT("folder-alert.svg"),
		CLOCK_OUTLINE("folder-clock-outline.svg"),
		CLOCK("folder-clock.svg"),
		DOWNLOAD("folder-download.svg"),
		EDIT_OUTLINE("folder-edit-outline.svg"),
		EDIT("folder-edit.svg"),
		GOOGLE_DRIVE("folder-google-drive.svg"),
		IMAGE("folder-image.svg"),
		KEY_NETWORK_OUTLINE("folder-key-network-outline.svg"),
		KEY_NETWORK("folder-key-network.svg"),
		KEY("folder-key.svg"),
		LOCK_OPEN("folder-lock-open.svg"),
		LOCK("folder-lock.svg"),
		MOVE("folder-move.svg"),
		MULTIPLE_IMAGE("folder-multiple-image.svg"),
		MULTIPLE_OUTLINE("folder-multiple-outline.svg"),
		MULTIPLE("folder-multiple.svg"),
		NETWORK_OUTLINE("folder-network-outline.svg"),
		NETWORK("folder-network.svg"),
		OPEN_OUTLINE("folder-open-outline.svg"),
		OPEN("folder-open.svg"),
		OUTLINE_LOCK("folder-outline-lock.svg"),
		OUTLINE("folder-outline.svg"),
		PLUS_OUTLINE("folder-plus-outline.svg"),
		PLUS("folder-plus.svg"),
		POUND_OUTLINE("folder-pound-outline.svg"),
		POUND("folder-pound.svg"),
		REMOVE_OUTLINE("folder-remove-outline.svg"),
		REMOVE("folder-remove.svg"),
		SEARCH_OUTLINE("folder-search-outline.svg"),
		SEARCH("folder-search.svg"),
		STAR_OUTLINE("folder-star-outline.svg"),
		STAR("folder-star.svg"),
		SYNC_OUTLINE("folder-sync-outline.svg"),
		SYNC("folder-sync.svg"),
		TEXT_OUTLINE("folder-text-outline.svg"),
		TEXT("folder-text.svg"),
		UPLOAD("folder-upload.svg"),
		;
		private String name;

		FOLDER(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum GOOGLE implements SimpleIcon {
		ADWORDS("google-adwords.svg"),
		ANALYTICS("google-analytics.svg"),
		ASSISTANT("google-assistant.svg"),
		CARDBOARD("google-cardboard.svg"),
		CHROME("google-chrome.svg"),
		CIRCLES_COMMUNITIES("google-circles-communities.svg"),
		CIRCLES_EXTENDED("google-circles-extended.svg"),
		CIRCLES_GROUP("google-circles-group.svg"),
		CIRCLES("google-circles.svg"),
		CLASSROOM("google-classroom.svg"),
		CONTROLLER_OFF("google-controller-off.svg"),
		CONTROLLER("google-controller.svg"),
		DRIVE("google-drive.svg"),
		EARTH("google-earth.svg"),
		FIT("google-fit.svg"),
		GLASS("google-glass.svg"),
		HOME("google-home.svg"),
		KEEP("google-keep.svg"),
		LENS("google-lens.svg"),
		MAPS("google-maps.svg"),
		NEARBY("google-nearby.svg"),
		PAGES("google-pages.svg"),
		PHOTOS("google-photos.svg"),
		PHYSICAL_WEB("google-physical-web.svg"),
		PLAY("google-play.svg"),
		PLUS_BOX("google-plus-box.svg"),
		PLUS("google-plus.svg"),
		SPREADSHEET("google-spreadsheet.svg"),
		STREET_VIEW("google-street-view.svg"),
		TRANSLATE("google-translate.svg"),
		WALLET("google-wallet.svg"),
		;
		private String name;

		GOOGLE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum LANGUAGE implements SimpleIcon {
		C("language-c.svg"),
		CPP("language-cpp.svg"),
		CSHARP("language-csharp.svg"),
		CSS3("language-css3.svg"),
		GO("language-go.svg"),
		HASKELL("language-haskell.svg"),
		HTML5("language-html5.svg"),
		JAVA("language-java.svg"),
		JAVASCRIPT("language-javascript.svg"),
		JSX("language-jsx.svg"),
		LUA("language-lua.svg"),
		PHP("language-php.svg"),
		PYTHON_TEXT("language-python-text.svg"),
		PYTHON("language-python.svg"),
		R("language-r.svg"),
		RUBY_ON_RAILS("language-ruby-on-rails.svg"),
		SWIFT("language-swift.svg"),
		TYPESCRIPT("language-typescript.svg"),
		;
		private String name;

		LANGUAGE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum NETWORK implements SimpleIcon {
		OFF_OUTLINE("network-off-outline.svg"),
		OFF("network-off.svg"),
		OUTLINE("network-outline.svg"),
		STRENGTH_1_ALERT("network-strength-1-alert.svg"),
		STRENGTH_1("network-strength-1.svg"),
		STRENGTH_2_ALERT("network-strength-2-alert.svg"),
		STRENGTH_2("network-strength-2.svg"),
		STRENGTH_3_ALERT("network-strength-3-alert.svg"),
		STRENGTH_3("network-strength-3.svg"),
		STRENGTH_4("network-strength-4.svg"),
		STRENGTH_ALERT_OUTLINE("network-strength-alert-outline.svg"),
		STRENGTH_ALERT("network-strength-alert.svg"),
		STRENGTH_OFF_OUTLINE("network-strength-off-outline.svg"),
		STRENGTH_OFF("network-strength-off.svg"),
		STRENGTH_OUTLINE("network-strength-outline.svg"),
		;
		private String name;

		NETWORK(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CAMERA implements SimpleIcon {
		ACCOUNT("camera-account.svg"),
		BURST("camera-burst.svg"),
		CONTROL("camera-control.svg"),
		ENHANCE_OUTLINE("camera-enhance-outline.svg"),
		ENHANCE("camera-enhance.svg"),
		FOCUS("camera-focus.svg"),
		FRONT_VARIANT("camera-front-variant.svg"),
		FRONT("camera-front.svg"),
		GOPRO("camera-gopro.svg"),
		IMAGE("camera-image.svg"),
		IRIS("camera-iris.svg"),
		METERING_CENTER("camera-metering-center.svg"),
		METERING_MATRIX("camera-metering-matrix.svg"),
		METERING_PARTIAL("camera-metering-partial.svg"),
		METERING_SPOT("camera-metering-spot.svg"),
		OFF("camera-off.svg"),
		OUTLINE("camera-outline.svg"),
		PARTY_MODE("camera-party-mode.svg"),
		REAR_VARIANT("camera-rear-variant.svg"),
		REAR("camera-rear.svg"),
		RETAKE_OUTLINE("camera-retake-outline.svg"),
		RETAKE("camera-retake.svg"),
		SWITCH("camera-switch.svg"),
		TIMER("camera-timer.svg"),
		WIRELESS_OUTLINE("camera-wireless-outline.svg"),
		WIRELESS("camera-wireless.svg"),
		;
		private String name;

		CAMERA(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum PAGE implements SimpleIcon {
		FIRST("page-first.svg"),
		LAST("page-last.svg"),
		LAYOUT_BODY("page-layout-body.svg"),
		LAYOUT_FOOTER("page-layout-footer.svg"),
		LAYOUT_HEADER("page-layout-header.svg"),
		LAYOUT_SIDEBAR_LEFT("page-layout-sidebar-left.svg"),
		LAYOUT_SIDEBAR_RIGHT("page-layout-sidebar-right.svg"),
		NEXT_OUTLINE("page-next-outline.svg"),
		NEXT("page-next.svg"),
		PREVIOUS_OUTLINE("page-previous-outline.svg"),
		PREVIOUS("page-previous.svg"),
		;
		private String name;

		PAGE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum BRIEFCASE implements SimpleIcon {
		ACCOUNT_OUTLINE("briefcase-account-outline.svg"),
		ACCOUNT("briefcase-account.svg"),
		CHECK_OUTLINE("briefcase-check-outline.svg"),
		CHECK("briefcase-check.svg"),
		DOWNLOAD_OUTLINE("briefcase-download-outline.svg"),
		DOWNLOAD("briefcase-download.svg"),
		EDIT_OUTLINE("briefcase-edit-outline.svg"),
		EDIT("briefcase-edit.svg"),
		MINUS_OUTLINE("briefcase-minus-outline.svg"),
		MINUS("briefcase-minus.svg"),
		OUTLINE("briefcase-outline.svg"),
		PLUS_OUTLINE("briefcase-plus-outline.svg"),
		PLUS("briefcase-plus.svg"),
		REMOVE_OUTLINE("briefcase-remove-outline.svg"),
		REMOVE("briefcase-remove.svg"),
		SEARCH_OUTLINE("briefcase-search-outline.svg"),
		SEARCH("briefcase-search.svg"),
		UPLOAD_OUTLINE("briefcase-upload-outline.svg"),
		UPLOAD("briefcase-upload.svg"),
		;
		private String name;

		BRIEFCASE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CIRCLE implements SimpleIcon {
		EDIT_OUTLINE("circle-edit-outline.svg"),
		MEDIUM("circle-medium.svg"),
		OUTLINE("circle-outline.svg"),
		SLICE_1("circle-slice-1.svg"),
		SLICE_2("circle-slice-2.svg"),
		SLICE_3("circle-slice-3.svg"),
		SLICE_4("circle-slice-4.svg"),
		SLICE_5("circle-slice-5.svg"),
		SLICE_6("circle-slice-6.svg"),
		SLICE_7("circle-slice-7.svg"),
		SLICE_8("circle-slice-8.svg"),
		SMALL("circle-small.svg"),
		;
		private String name;

		CIRCLE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum HEART implements SimpleIcon {
		BOX_OUTLINE("heart-box-outline.svg"),
		BOX("heart-box.svg"),
		BROKEN_OUTLINE("heart-broken-outline.svg"),
		BROKEN("heart-broken.svg"),
		CIRCLE_OUTLINE("heart-circle-outline.svg"),
		CIRCLE("heart-circle.svg"),
		HALF_FULL("heart-half-full.svg"),
		HALF_OUTLINE("heart-half-outline.svg"),
		HALF("heart-half.svg"),
		MULTIPLE_OUTLINE("heart-multiple-outline.svg"),
		MULTIPLE("heart-multiple.svg"),
		OFF("heart-off.svg"),
		OUTLINE("heart-outline.svg"),
		PULSE("heart-pulse.svg"),
		;
		private String name;

		HEART(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum BORDER implements SimpleIcon {
		ALL_VARIANT("border-all-variant.svg"),
		ALL("border-all.svg"),
		BOTTOM_VARIANT("border-bottom-variant.svg"),
		BOTTOM("border-bottom.svg"),
		COLOR("border-color.svg"),
		HORIZONTAL("border-horizontal.svg"),
		INSIDE("border-inside.svg"),
		LEFT_VARIANT("border-left-variant.svg"),
		LEFT("border-left.svg"),
		NONE_VARIANT("border-none-variant.svg"),
		NONE("border-none.svg"),
		OUTSIDE("border-outside.svg"),
		RIGHT_VARIANT("border-right-variant.svg"),
		RIGHT("border-right.svg"),
		STYLE("border-style.svg"),
		TOP_VARIANT("border-top-variant.svg"),
		TOP("border-top.svg"),
		VERTICAL("border-vertical.svg"),
		;
		private String name;

		BORDER(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum DATABASE implements SimpleIcon {
		CHECK("database-check.svg"),
		EDIT("database-edit.svg"),
		EXPORT("database-export.svg"),
		IMPORT("database-import.svg"),
		LOCK("database-lock.svg"),
		MINUS("database-minus.svg"),
		PLUS("database-plus.svg"),
		REFRESH("database-refresh.svg"),
		REMOVE("database-remove.svg"),
		SEARCH("database-search.svg"),
		SETTINGS("database-settings.svg"),
		;
		private String name;

		DATABASE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CAR implements SimpleIcon {
		BATTERY("car-battery.svg"),
		BRAKE_ABS("car-brake-abs.svg"),
		BRAKE_ALERT("car-brake-alert.svg"),
		BRAKE_HOLD("car-brake-hold.svg"),
		BRAKE_PARKING("car-brake-parking.svg"),
		CONNECTED("car-connected.svg"),
		CONVERTABLE("car-convertable.svg"),
		CRUISE_CONTROL("car-cruise-control.svg"),
		DEFROST_FRONT("car-defrost-front.svg"),
		DEFROST_REAR("car-defrost-rear.svg"),
		DOOR("car-door.svg"),
		ELECTRIC("car-electric.svg"),
		ESP("car-esp.svg"),
		ESTATE("car-estate.svg"),
		HATCHBACK("car-hatchback.svg"),
		KEY("car-key.svg"),
		LIGHT_DIMMED("car-light-dimmed.svg"),
		LIGHT_FOG("car-light-fog.svg"),
		LIGHT_HIGH("car-light-high.svg"),
		LIMOUSINE("car-limousine.svg"),
		MULTIPLE("car-multiple.svg"),
		OFF("car-off.svg"),
		PARKING_LIGHTS("car-parking-lights.svg"),
		PICKUP("car-pickup.svg"),
		SIDE("car-side.svg"),
		SPORTS("car-sports.svg"),
		TIRE_ALERT("car-tire-alert.svg"),
		TRACTION_CONTROL("car-traction-control.svg"),
		WASH("car-wash.svg"),
		;
		private String name;

		CAR(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum SOURCE implements SimpleIcon {
		BRANCH("source-branch.svg"),
		COMMIT_END_LOCAL("source-commit-end-local.svg"),
		COMMIT_END("source-commit-end.svg"),
		COMMIT_LOCAL("source-commit-local.svg"),
		COMMIT_NEXT_LOCAL("source-commit-next-local.svg"),
		COMMIT_START_NEXT_LOCAL("source-commit-start-next-local.svg"),
		COMMIT_START("source-commit-start.svg"),
		COMMIT("source-commit.svg"),
		FORK("source-fork.svg"),
		MERGE("source-merge.svg"),
		PULL("source-pull.svg"),
		REPOSITORY_MULTIPLE("source-repository-multiple.svg"),
		REPOSITORY("source-repository.svg"),
		;
		private String name;

		SOURCE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CHECK implements SimpleIcon {
		ALL("check-all.svg"),
		BOLD("check-bold.svg"),
		BOOKMARK("check-bookmark.svg"),
		BOX_MULTIPLE_OUTLINE("check-box-multiple-outline.svg"),
		BOX_OUTLINE("check-box-outline.svg"),
		CIRCLE_OUTLINE("check-circle-outline.svg"),
		CIRCLE("check-circle.svg"),
		NETWORK_OUTLINE("check-network-outline.svg"),
		NETWORK("check-network.svg"),
		OUTLINE("check-outline.svg"),
		UNDERLINE_CIRCLE_OUTLINE("check-underline-circle-outline.svg"),
		UNDERLINE_CIRCLE("check-underline-circle.svg"),
		UNDERLINE("check-underline.svg"),
		;
		private String name;

		CHECK(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CALENDAR implements SimpleIcon {
		ALERT("calendar-alert.svg"),
		BLANK_OUTLINE("calendar-blank-outline.svg"),
		BLANK("calendar-blank.svg"),
		CHECK_OUTLINE("calendar-check-outline.svg"),
		CHECK("calendar-check.svg"),
		CLOCK("calendar-clock.svg"),
		EDIT("calendar-edit.svg"),
		EXPORT("calendar-export.svg"),
		HEART("calendar-heart.svg"),
		IMPORT("calendar-import.svg"),
		MINUS("calendar-minus.svg"),
		MONTH_OUTLINE("calendar-month-outline.svg"),
		MONTH("calendar-month.svg"),
		MULTIPLE_CHECK("calendar-multiple-check.svg"),
		MULTIPLE("calendar-multiple.svg"),
		MULTISELECT("calendar-multiselect.svg"),
		OUTLINE("calendar-outline.svg"),
		PLUS("calendar-plus.svg"),
		QUESTION("calendar-question.svg"),
		RANGE_OUTLINE("calendar-range-outline.svg"),
		RANGE("calendar-range.svg"),
		REMOVE_OUTLINE("calendar-remove-outline.svg"),
		REMOVE("calendar-remove.svg"),
		SEARCH("calendar-search.svg"),
		SELECT("calendar-select.svg"),
		STAR("calendar-star.svg"),
		TEXT_OUTLINE("calendar-text-outline.svg"),
		TEXT("calendar-text.svg"),
		TODAY("calendar-today.svg"),
		WEEK_BEGIN("calendar-week-begin.svg"),
		WEEK("calendar-week.svg"),
		;
		private String name;

		CALENDAR(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum MAP implements SimpleIcon {
		CLOCK_OUTLINE("map-clock-outline.svg"),
		CLOCK("map-clock.svg"),
		LEGEND("map-legend.svg"),
		MARKER_CHECK("map-marker-check.svg"),
		MARKER_CIRCLE("map-marker-circle.svg"),
		MARKER_DISTANCE("map-marker-distance.svg"),
		MARKER_MINUS("map-marker-minus.svg"),
		MARKER_MULTIPLE("map-marker-multiple.svg"),
		MARKER_OFF("map-marker-off.svg"),
		MARKER_OUTLINE("map-marker-outline.svg"),
		MARKER_PATH("map-marker-path.svg"),
		MARKER_PLUS("map-marker-plus.svg"),
		MARKER_RADIUS("map-marker-radius.svg"),
		MARKER("map-marker.svg"),
		MINUS("map-minus.svg"),
		OUTLINE("map-outline.svg"),
		PLUS("map-plus.svg"),
		SEARCH_OUTLINE("map-search-outline.svg"),
		SEARCH("map-search.svg"),
		;
		private String name;

		MAP(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum WIFI implements SimpleIcon {
		OFF("wifi-off.svg"),
		STAR("wifi-star.svg"),
		STRENGTH_1_ALERT("wifi-strength-1-alert.svg"),
		STRENGTH_1_LOCK("wifi-strength-1-lock.svg"),
		STRENGTH_1("wifi-strength-1.svg"),
		STRENGTH_2_ALERT("wifi-strength-2-alert.svg"),
		STRENGTH_2_LOCK("wifi-strength-2-lock.svg"),
		STRENGTH_2("wifi-strength-2.svg"),
		STRENGTH_3_ALERT("wifi-strength-3-alert.svg"),
		STRENGTH_3_LOCK("wifi-strength-3-lock.svg"),
		STRENGTH_3("wifi-strength-3.svg"),
		STRENGTH_4_ALERT("wifi-strength-4-alert.svg"),
		STRENGTH_4_LOCK("wifi-strength-4-lock.svg"),
		STRENGTH_4("wifi-strength-4.svg"),
		STRENGTH_ALERT_OUTLINE("wifi-strength-alert-outline.svg"),
		STRENGTH_LOCK_OUTLINE("wifi-strength-lock-outline.svg"),
		STRENGTH_OFF_OUTLINE("wifi-strength-off-outline.svg"),
		STRENGTH_OFF("wifi-strength-off.svg"),
		STRENGTH_OUTLINE("wifi-strength-outline.svg"),
		;
		private String name;

		WIFI(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum AXIS implements SimpleIcon {
		ARROW_LOCK("axis-arrow-lock.svg"),
		ARROW("axis-arrow.svg"),
		LOCK("axis-lock.svg"),
		X_ARROW_LOCK("axis-x-arrow-lock.svg"),
		X_ARROW("axis-x-arrow.svg"),
		X_ROTATE_CLOCKWISE("axis-x-rotate-clockwise.svg"),
		X_ROTATE_COUNTERCLOCKWISE("axis-x-rotate-counterclockwise.svg"),
		X_Y_ARROW_LOCK("axis-x-y-arrow-lock.svg"),
		Y_ARROW_LOCK("axis-y-arrow-lock.svg"),
		Y_ARROW("axis-y-arrow.svg"),
		Y_ROTATE_CLOCKWISE("axis-y-rotate-clockwise.svg"),
		Y_ROTATE_COUNTERCLOCKWISE("axis-y-rotate-counterclockwise.svg"),
		Z_ARROW_LOCK("axis-z-arrow-lock.svg"),
		Z_ARROW("axis-z-arrow.svg"),
		Z_ROTATE_CLOCKWISE("axis-z-rotate-clockwise.svg"),
		Z_ROTATE_COUNTERCLOCKWISE("axis-z-rotate-counterclockwise.svg"),
		;
		private String name;

		AXIS(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum PLUS implements SimpleIcon {
		BOX_OUTLINE("plus-box-outline.svg"),
		BOX("plus-box.svg"),
		CIRCLE_MULTIPLE_OUTLINE("plus-circle-multiple-outline.svg"),
		CIRCLE_OUTLINE("plus-circle-outline.svg"),
		CIRCLE("plus-circle.svg"),
		MINUS_BOX("plus-minus-box.svg"),
		MINUS("plus-minus.svg"),
		NETWORK_OUTLINE("plus-network-outline.svg"),
		NETWORK("plus-network.svg"),
		ONE("plus-one.svg"),
		OUTLINE("plus-outline.svg"),
		;
		private String name;

		PLUS(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CLIPBOARD implements SimpleIcon {
		ACCOUNT_OUTLINE("clipboard-account-outline.svg"),
		ACCOUNT("clipboard-account.svg"),
		ALERT_OUTLINE("clipboard-alert-outline.svg"),
		ALERT("clipboard-alert.svg"),
		ARROW_DOWN_OUTLINE("clipboard-arrow-down-outline.svg"),
		ARROW_DOWN("clipboard-arrow-down.svg"),
		ARROW_LEFT_OUTLINE("clipboard-arrow-left-outline.svg"),
		ARROW_LEFT("clipboard-arrow-left.svg"),
		ARROW_RIGHT_OUTLINE("clipboard-arrow-right-outline.svg"),
		ARROW_RIGHT("clipboard-arrow-right.svg"),
		ARROW_UP_OUTLINE("clipboard-arrow-up-outline.svg"),
		ARROW_UP("clipboard-arrow-up.svg"),
		CHECK_OUTLINE("clipboard-check-outline.svg"),
		CHECK("clipboard-check.svg"),
		FLOW("clipboard-flow.svg"),
		OUTLINE("clipboard-outline.svg"),
		PLAY_OUTLINE("clipboard-play-outline.svg"),
		PLAY("clipboard-play.svg"),
		PLUS("clipboard-plus.svg"),
		PULSE_OUTLINE("clipboard-pulse-outline.svg"),
		PULSE("clipboard-pulse.svg"),
		TEXT_OUTLINE("clipboard-text-outline.svg"),
		TEXT_PLAY_OUTLINE("clipboard-text-play-outline.svg"),
		TEXT_PLAY("clipboard-text-play.svg"),
		TEXT("clipboard-text.svg"),
		;
		private String name;

		CLIPBOARD(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CLOUD implements SimpleIcon {
		ALERT("cloud-alert.svg"),
		BRACES("cloud-braces.svg"),
		CHECK("cloud-check.svg"),
		CIRCLE("cloud-circle.svg"),
		DOWNLOAD_OUTLINE("cloud-download-outline.svg"),
		DOWNLOAD("cloud-download.svg"),
		OFF_OUTLINE("cloud-off-outline.svg"),
		OUTLINE("cloud-outline.svg"),
		PRINT_OUTLINE("cloud-print-outline.svg"),
		PRINT("cloud-print.svg"),
		QUESTION("cloud-question.svg"),
		SEARCH_OUTLINE("cloud-search-outline.svg"),
		SEARCH("cloud-search.svg"),
		SYNC("cloud-sync.svg"),
		TAGS("cloud-tags.svg"),
		UPLOAD_OUTLINE("cloud-upload-outline.svg"),
		UPLOAD("cloud-upload.svg"),
		;
		private String name;

		CLOUD(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum PHONE implements SimpleIcon {
		BLUETOOTH("phone-bluetooth.svg"),
		CLASSIC("phone-classic.svg"),
		FORWARD("phone-forward.svg"),
		HANGUP("phone-hangup.svg"),
		IN_TALK("phone-in-talk.svg"),
		INCOMING("phone-incoming.svg"),
		LOCKED("phone-locked.svg"),
		LOG("phone-log.svg"),
		MINUS("phone-minus.svg"),
		MISSED("phone-missed.svg"),
		OFF("phone-off.svg"),
		OUTGOING("phone-outgoing.svg"),
		OUTLINE("phone-outline.svg"),
		PAUSED("phone-paused.svg"),
		PLUS("phone-plus.svg"),
		RETURN("phone-return.svg"),
		ROTATE_LANDSCAPE("phone-rotate-landscape.svg"),
		ROTATE_PORTRAIT("phone-rotate-portrait.svg"),
		SETTINGS("phone-settings.svg"),
		VOIP("phone-voip.svg"),
		;
		private String name;

		PHONE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum KEYBOARD implements SimpleIcon {
		BACKSPACE("keyboard-backspace.svg"),
		CAPS("keyboard-caps.svg"),
		CLOSE("keyboard-close.svg"),
		OFF_OUTLINE("keyboard-off-outline.svg"),
		OFF("keyboard-off.svg"),
		OUTLINE("keyboard-outline.svg"),
		RETURN("keyboard-return.svg"),
		SETTINGS_OUTLINE("keyboard-settings-outline.svg"),
		SETTINGS("keyboard-settings.svg"),
		TAB("keyboard-tab.svg"),
		VARIANT("keyboard-variant.svg"),
		;
		private String name;

		KEYBOARD(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum COMMENT implements SimpleIcon {
		ACCOUNT_OUTLINE("comment-account-outline.svg"),
		ACCOUNT("comment-account.svg"),
		ALERT_OUTLINE("comment-alert-outline.svg"),
		ALERT("comment-alert.svg"),
		ARROW_LEFT_OUTLINE("comment-arrow-left-outline.svg"),
		ARROW_LEFT("comment-arrow-left.svg"),
		ARROW_RIGHT_OUTLINE("comment-arrow-right-outline.svg"),
		ARROW_RIGHT("comment-arrow-right.svg"),
		CHECK_OUTLINE("comment-check-outline.svg"),
		CHECK("comment-check.svg"),
		EYE_OUTLINE("comment-eye-outline.svg"),
		EYE("comment-eye.svg"),
		MULTIPLE_OUTLINE("comment-multiple-outline.svg"),
		MULTIPLE("comment-multiple.svg"),
		OUTLINE("comment-outline.svg"),
		PLUS_OUTLINE("comment-plus-outline.svg"),
		PLUS("comment-plus.svg"),
		PROCESSING_OUTLINE("comment-processing-outline.svg"),
		PROCESSING("comment-processing.svg"),
		QUESTION_OUTLINE("comment-question-outline.svg"),
		QUESTION("comment-question.svg"),
		REMOVE_OUTLINE("comment-remove-outline.svg"),
		REMOVE("comment-remove.svg"),
		SEARCH_OUTLINE("comment-search-outline.svg"),
		SEARCH("comment-search.svg"),
		TEXT_MULTIPLE_OUTLINE("comment-text-multiple-outline.svg"),
		TEXT_MULTIPLE("comment-text-multiple.svg"),
		TEXT_OUTLINE("comment-text-outline.svg"),
		TEXT("comment-text.svg"),
		;
		private String name;

		COMMENT(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum HAND implements SimpleIcon {
		LEFT("hand-left.svg"),
		OKAY("hand-okay.svg"),
		PEACE_VARIANT("hand-peace-variant.svg"),
		PEACE("hand-peace.svg"),
		POINTING_DOWN("hand-pointing-down.svg"),
		POINTING_LEFT("hand-pointing-left.svg"),
		POINTING_RIGHT("hand-pointing-right.svg"),
		POINTING_UP("hand-pointing-up.svg"),
		RIGHT("hand-right.svg"),
		SAW("hand-saw.svg"),
		;
		private String name;

		HAND(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum MESSAGE implements SimpleIcon {
		ALERT_OUTLINE("message-alert-outline.svg"),
		ALERT("message-alert.svg"),
		BULLETED_OFF("message-bulleted-off.svg"),
		BULLETED("message-bulleted.svg"),
		DRAW("message-draw.svg"),
		IMAGE("message-image.svg"),
		OUTLINE("message-outline.svg"),
		PLUS("message-plus.svg"),
		PROCESSING("message-processing.svg"),
		REPLY_TEXT("message-reply-text.svg"),
		REPLY("message-reply.svg"),
		SETTINGS_VARIANT("message-settings-variant.svg"),
		SETTINGS("message-settings.svg"),
		TEXT_OUTLINE("message-text-outline.svg"),
		TEXT("message-text.svg"),
		VIDEO("message-video.svg"),
		;
		private String name;

		MESSAGE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum DELETE implements SimpleIcon {
		CIRCLE_OUTLINE("delete-circle-outline.svg"),
		CIRCLE("delete-circle.svg"),
		EMPTY("delete-empty.svg"),
		FOREVER_OUTLINE("delete-forever-outline.svg"),
		FOREVER("delete-forever.svg"),
		OUTLINE("delete-outline.svg"),
		RESTORE("delete-restore.svg"),
		SWEEP_OUTLINE("delete-sweep-outline.svg"),
		SWEEP("delete-sweep.svg"),
		VARIANT("delete-variant.svg"),
		;
		private String name;

		DELETE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum SHIELD implements SimpleIcon {
		ACCOUNT_OUTLINE("shield-account-outline.svg"),
		ACCOUNT("shield-account.svg"),
		AIRPLANE_OUTLINE("shield-airplane-outline.svg"),
		AIRPLANE("shield-airplane.svg"),
		CHECK_OUTLINE("shield-check-outline.svg"),
		CROSS_OUTLINE("shield-cross-outline.svg"),
		CROSS("shield-cross.svg"),
		HALF_FULL("shield-half-full.svg"),
		HOME_OUTLINE("shield-home-outline.svg"),
		HOME("shield-home.svg"),
		KEY_OUTLINE("shield-key-outline.svg"),
		KEY("shield-key.svg"),
		LINK_VARIANT_OUTLINE("shield-link-variant-outline.svg"),
		LINK_VARIANT("shield-link-variant.svg"),
		LOCK_OUTLINE("shield-lock-outline.svg"),
		LOCK("shield-lock.svg"),
		OFF_OUTLINE("shield-off-outline.svg"),
		OFF("shield-off.svg"),
		OUTLINE("shield-outline.svg"),
		PLUS_OUTLINE("shield-plus-outline.svg"),
		PLUS("shield-plus.svg"),
		REMOVE_OUTLINE("shield-remove-outline.svg"),
		REMOVE("shield-remove.svg"),
		SEARCH("shield-search.svg"),
		;
		private String name;

		SHIELD(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum ARROW implements SimpleIcon {
		ALL("arrow-all.svg"),
		BOTTOM_LEFT_BOLD_OUTLINE("arrow-bottom-left-bold-outline.svg"),
		BOTTOM_LEFT_THICK("arrow-bottom-left-thick.svg"),
		BOTTOM_LEFT("arrow-bottom-left.svg"),
		BOTTOM_RIGHT_BOLD_OUTLINE("arrow-bottom-right-bold-outline.svg"),
		BOTTOM_RIGHT_THICK("arrow-bottom-right-thick.svg"),
		BOTTOM_RIGHT("arrow-bottom-right.svg"),
		COLLAPSE_ALL("arrow-collapse-all.svg"),
		COLLAPSE_DOWN("arrow-collapse-down.svg"),
		COLLAPSE_HORIZONTAL("arrow-collapse-horizontal.svg"),
		COLLAPSE_LEFT("arrow-collapse-left.svg"),
		COLLAPSE_RIGHT("arrow-collapse-right.svg"),
		COLLAPSE_UP("arrow-collapse-up.svg"),
		COLLAPSE_VERTICAL("arrow-collapse-vertical.svg"),
		COLLAPSE("arrow-collapse.svg"),
		DECISION_AUTO_OUTLINE("arrow-decision-auto-outline.svg"),
		DECISION_AUTO("arrow-decision-auto.svg"),
		DECISION_OUTLINE("arrow-decision-outline.svg"),
		DECISION("arrow-decision.svg"),
		DOWN_BOLD_BOX_OUTLINE("arrow-down-bold-box-outline.svg"),
		DOWN_BOLD_BOX("arrow-down-bold-box.svg"),
		DOWN_BOLD_CIRCLE_OUTLINE("arrow-down-bold-circle-outline.svg"),
		DOWN_BOLD_CIRCLE("arrow-down-bold-circle.svg"),
		DOWN_BOLD_HEXAGON_OUTLINE("arrow-down-bold-hexagon-outline.svg"),
		DOWN_BOLD_OUTLINE("arrow-down-bold-outline.svg"),
		DOWN_BOLD("arrow-down-bold.svg"),
		DOWN_BOX("arrow-down-box.svg"),
		DOWN_CIRCLE_OUTLINE("arrow-down-circle-outline.svg"),
		DOWN_CIRCLE("arrow-down-circle.svg"),
		DOWN_DROP_CIRCLE_OUTLINE("arrow-down-drop-circle-outline.svg"),
		DOWN_DROP_CIRCLE("arrow-down-drop-circle.svg"),
		DOWN_DROP("arrow-down-drop.svg"),
		DOWN_THICK("arrow-down-thick.svg"),
		DOWN("arrow-down.svg"),
		EXPAND_ALL("arrow-expand-all.svg"),
		EXPAND_DOWN("arrow-expand-down.svg"),
		EXPAND_HORIZONTAL("arrow-expand-horizontal.svg"),
		EXPAND_LEFT("arrow-expand-left.svg"),
		EXPAND_RIGHT("arrow-expand-right.svg"),
		EXPAND_UP("arrow-expand-up.svg"),
		EXPAND_VERTICAL("arrow-expand-vertical.svg"),
		EXPAND("arrow-expand.svg"),
		LEFT_BOLD_BOX_OUTLINE("arrow-left-bold-box-outline.svg"),
		LEFT_BOLD_BOX("arrow-left-bold-box.svg"),
		LEFT_BOLD_CIRCLE_OUTLINE("arrow-left-bold-circle-outline.svg"),
		LEFT_BOLD_CIRCLE("arrow-left-bold-circle.svg"),
		LEFT_BOLD_HEXAGON_OUTLINE("arrow-left-bold-hexagon-outline.svg"),
		LEFT_BOLD_OUTLINE("arrow-left-bold-outline.svg"),
		LEFT_BOLD("arrow-left-bold.svg"),
		LEFT_BOX("arrow-left-box.svg"),
		LEFT_CIRCLE_OUTLINE("arrow-left-circle-outline.svg"),
		LEFT_CIRCLE("arrow-left-circle.svg"),
		LEFT_DROP_CIRCLE_OUTLINE("arrow-left-drop-circle-outline.svg"),
		LEFT_DROP_CIRCLE("arrow-left-drop-circle.svg"),
		LEFT_RIGHT_BOLD_OUTLINE("arrow-left-right-bold-outline.svg"),
		LEFT_THICK("arrow-left-thick.svg"),
		LEFT("arrow-left.svg"),
		RIGHT_BOLD_BOX_OUTLINE("arrow-right-bold-box-outline.svg"),
		RIGHT_BOLD_BOX("arrow-right-bold-box.svg"),
		RIGHT_BOLD_CIRCLE_OUTLINE("arrow-right-bold-circle-outline.svg"),
		RIGHT_BOLD_CIRCLE("arrow-right-bold-circle.svg"),
		RIGHT_BOLD_HEXAGON_OUTLINE("arrow-right-bold-hexagon-outline.svg"),
		RIGHT_BOLD_OUTLINE("arrow-right-bold-outline.svg"),
		RIGHT_BOLD("arrow-right-bold.svg"),
		RIGHT_BOX("arrow-right-box.svg"),
		RIGHT_CIRCLE_OUTLINE("arrow-right-circle-outline.svg"),
		RIGHT_CIRCLE("arrow-right-circle.svg"),
		RIGHT_DROP_CIRCLE_OUTLINE("arrow-right-drop-circle-outline.svg"),
		RIGHT_DROP_CIRCLE("arrow-right-drop-circle.svg"),
		RIGHT_THICK("arrow-right-thick.svg"),
		RIGHT("arrow-right.svg"),
		SPLIT_HORIZONTAL("arrow-split-horizontal.svg"),
		SPLIT_VERTICAL("arrow-split-vertical.svg"),
		TOP_LEFT_BOLD_OUTLINE("arrow-top-left-bold-outline.svg"),
		TOP_LEFT_THICK("arrow-top-left-thick.svg"),
		TOP_LEFT("arrow-top-left.svg"),
		TOP_RIGHT_BOLD_OUTLINE("arrow-top-right-bold-outline.svg"),
		TOP_RIGHT_THICK("arrow-top-right-thick.svg"),
		TOP_RIGHT("arrow-top-right.svg"),
		UP_BOLD_BOX_OUTLINE("arrow-up-bold-box-outline.svg"),
		UP_BOLD_BOX("arrow-up-bold-box.svg"),
		UP_BOLD_CIRCLE_OUTLINE("arrow-up-bold-circle-outline.svg"),
		UP_BOLD_CIRCLE("arrow-up-bold-circle.svg"),
		UP_BOLD_HEXAGON_OUTLINE("arrow-up-bold-hexagon-outline.svg"),
		UP_BOLD_OUTLINE("arrow-up-bold-outline.svg"),
		UP_BOLD("arrow-up-bold.svg"),
		UP_BOX("arrow-up-box.svg"),
		UP_CIRCLE_OUTLINE("arrow-up-circle-outline.svg"),
		UP_CIRCLE("arrow-up-circle.svg"),
		UP_DOWN_BOLD_OUTLINE("arrow-up-down-bold-outline.svg"),
		UP_DROP_CIRCLE_OUTLINE("arrow-up-drop-circle-outline.svg"),
		UP_DROP_CIRCLE("arrow-up-drop-circle.svg"),
		UP_THICK("arrow-up-thick.svg"),
		UP("arrow-up.svg"),
		;
		private String name;

		ARROW(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CONTENT implements SimpleIcon {
		COPY("content-copy.svg"),
		CUT("content-cut.svg"),
		DUPLICATE("content-duplicate.svg"),
		PASTE("content-paste.svg"),
		SAVE_ALL("content-save-all.svg"),
		SAVE_EDIT_OUTLINE("content-save-edit-outline.svg"),
		SAVE_EDIT("content-save-edit.svg"),
		SAVE_MOVE_OUTLINE("content-save-move-outline.svg"),
		SAVE_MOVE("content-save-move.svg"),
		SAVE_OUTLINE("content-save-outline.svg"),
		SAVE_SETTINGS_OUTLINE("content-save-settings-outline.svg"),
		SAVE_SETTINGS("content-save-settings.svg"),
		SAVE("content-save.svg"),
		;
		private String name;

		CONTENT(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum FILE implements SimpleIcon {
		ACCOUNT("file-account.svg"),
		ALERT_OUTLINE("file-alert-outline.svg"),
		ALERT("file-alert.svg"),
		CABINET("file-cabinet.svg"),
		CANCEL_OUTLINE("file-cancel-outline.svg"),
		CANCEL("file-cancel.svg"),
		CHART("file-chart.svg"),
		CHECK_OUTLINE("file-check-outline.svg"),
		CHECK("file-check.svg"),
		CLOUD("file-cloud.svg"),
		COMPARE("file-compare.svg"),
		DELIMITED("file-delimited.svg"),
		DOCUMENT_BOX_MULTIPLE_OUTLINE("file-document-box-multiple-outline.svg"),
		DOCUMENT_BOX_MULTIPLE("file-document-box-multiple.svg"),
		DOCUMENT_BOX_OUTLINE("file-document-box-outline.svg"),
		DOCUMENT_BOX("file-document-box.svg"),
		DOCUMENT_EDIT_OUTLINE("file-document-edit-outline.svg"),
		DOCUMENT_EDIT("file-document-edit.svg"),
		DOCUMENT_OUTLINE("file-document-outline.svg"),
		DOCUMENT("file-document.svg"),
		DOWNLOAD_OUTLINE("file-download-outline.svg"),
		DOWNLOAD("file-download.svg"),
		EXCEL_BOX("file-excel-box.svg"),
		EXCEL("file-excel.svg"),
		EXPORT("file-export.svg"),
		EYE_OUTLINE("file-eye-outline.svg"),
		EYE("file-eye.svg"),
		FIND_OUTLINE("file-find-outline.svg"),
		FIND("file-find.svg"),
		HIDDEN("file-hidden.svg"),
		IMAGE_BOX("file-image-box.svg"),
		IMAGE("file-image.svg"),
		IMPORT("file-import.svg"),
		LOCK("file-lock.svg"),
		MOVE("file-move.svg"),
		MULTIPLE("file-multiple.svg"),
		MUSIC_OUTLINE("file-music-outline.svg"),
		MUSIC("file-music.svg"),
		OUTLINE("file-outline.svg"),
		PDF_BOX("file-pdf-box.svg"),
		PDF_OUTLINE("file-pdf-outline.svg"),
		PDF("file-pdf.svg"),
		PERCENT("file-percent.svg"),
		PLUS("file-plus.svg"),
		POWERPOINT_BOX("file-powerpoint-box.svg"),
		POWERPOINT("file-powerpoint.svg"),
		PRESENTATION_BOX("file-presentation-box.svg"),
		QUESTION("file-question.svg"),
		REMOVE("file-remove.svg"),
		REPLACE_OUTLINE("file-replace-outline.svg"),
		REPLACE("file-replace.svg"),
		RESTORE("file-restore.svg"),
		SEARCH_OUTLINE("file-search-outline.svg"),
		SEARCH("file-search.svg"),
		SEND("file-send.svg"),
		TABLE_OUTLINE("file-table-outline.svg"),
		TABLE("file-table.svg"),
		TREE("file-tree.svg"),
		UNDO("file-undo.svg"),
		UPLOAD_OUTLINE("file-upload-outline.svg"),
		UPLOAD("file-upload.svg"),
		VIDEO_OUTLINE("file-video-outline.svg"),
		VIDEO("file-video.svg"),
		WORD_BOX("file-word-box.svg"),
		WORD("file-word.svg"),
		XML("file-xml.svg"),
		;
		private String name;

		FILE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum BATTERY implements SimpleIcon {
		_10_BLUETOOTH("battery-10-bluetooth.svg"),
		_10("battery-10.svg"),
		_20_BLUETOOTH("battery-20-bluetooth.svg"),
		_20("battery-20.svg"),
		_30_BLUETOOTH("battery-30-bluetooth.svg"),
		_30("battery-30.svg"),
		_40_BLUETOOTH("battery-40-bluetooth.svg"),
		_40("battery-40.svg"),
		_50_BLUETOOTH("battery-50-bluetooth.svg"),
		_50("battery-50.svg"),
		_60_BLUETOOTH("battery-60-bluetooth.svg"),
		_60("battery-60.svg"),
		_70_BLUETOOTH("battery-70-bluetooth.svg"),
		_70("battery-70.svg"),
		_80_BLUETOOTH("battery-80-bluetooth.svg"),
		_80("battery-80.svg"),
		_90_BLUETOOTH("battery-90-bluetooth.svg"),
		_90("battery-90.svg"),
		ALERT_BLUETOOTH("battery-alert-bluetooth.svg"),
		ALERT("battery-alert.svg"),
		BLUETOOTH_VARIANT("battery-bluetooth-variant.svg"),
		BLUETOOTH("battery-bluetooth.svg"),
		CHARGING_10("battery-charging-10.svg"),
		CHARGING_100("battery-charging-100.svg"),
		CHARGING_20("battery-charging-20.svg"),
		CHARGING_30("battery-charging-30.svg"),
		CHARGING_40("battery-charging-40.svg"),
		CHARGING_50("battery-charging-50.svg"),
		CHARGING_60("battery-charging-60.svg"),
		CHARGING_70("battery-charging-70.svg"),
		CHARGING_80("battery-charging-80.svg"),
		CHARGING_90("battery-charging-90.svg"),
		CHARGING_OUTLINE("battery-charging-outline.svg"),
		CHARGING_WIRELESS_10("battery-charging-wireless-10.svg"),
		CHARGING_WIRELESS_20("battery-charging-wireless-20.svg"),
		CHARGING_WIRELESS_30("battery-charging-wireless-30.svg"),
		CHARGING_WIRELESS_40("battery-charging-wireless-40.svg"),
		CHARGING_WIRELESS_50("battery-charging-wireless-50.svg"),
		CHARGING_WIRELESS_60("battery-charging-wireless-60.svg"),
		CHARGING_WIRELESS_70("battery-charging-wireless-70.svg"),
		CHARGING_WIRELESS_80("battery-charging-wireless-80.svg"),
		CHARGING_WIRELESS_90("battery-charging-wireless-90.svg"),
		CHARGING_WIRELESS_ALERT("battery-charging-wireless-alert.svg"),
		CHARGING_WIRELESS_OUTLINE("battery-charging-wireless-outline.svg"),
		CHARGING_WIRELESS("battery-charging-wireless.svg"),
		CHARGING("battery-charging.svg"),
		MINUS("battery-minus.svg"),
		NEGATIVE("battery-negative.svg"),
		OUTLINE("battery-outline.svg"),
		PLUS("battery-plus.svg"),
		POSITIVE("battery-positive.svg"),
		STANDARD("battery-standard.svg"),
		UNKNOWN_BLUETOOTH("battery-unknown-bluetooth.svg"),
		UNKNOWN("battery-unknown.svg"),
		;
		private String name;

		BATTERY(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CURRENCY implements SimpleIcon {
		BDT("currency-bdt.svg"),
		BRL("currency-brl.svg"),
		BTC("currency-btc.svg"),
		CHF("currency-chf.svg"),
		CNY("currency-cny.svg"),
		ETH("currency-eth.svg"),
		EUR("currency-eur.svg"),
		GBP("currency-gbp.svg"),
		ILS("currency-ils.svg"),
		INR("currency-inr.svg"),
		JPY("currency-jpy.svg"),
		KRW("currency-krw.svg"),
		KZT("currency-kzt.svg"),
		NGN("currency-ngn.svg"),
		PHP("currency-php.svg"),
		RUB("currency-rub.svg"),
		SIGN("currency-sign.svg"),
		TRY("currency-try.svg"),
		TWD("currency-twd.svg"),
		USD_OFF("currency-usd-off.svg"),
		USD("currency-usd.svg"),
		;
		private String name;

		CURRENCY(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum SIGNAL implements SimpleIcon {
		_2G("signal-2g.svg"),
		_3G("signal-3g.svg"),
		_4G("signal-4g.svg"),
		_5G("signal-5g.svg"),
		CELLULAR_0("signal-cellular-0.svg"),
		CELLULAR_1("signal-cellular-1.svg"),
		CELLULAR_2("signal-cellular-2.svg"),
		CELLULAR_3("signal-cellular-3.svg"),
		DISTANCE_VARIANT("signal-distance-variant.svg"),
		HSPA_PLUS("signal-hspa-plus.svg"),
		HSPA("signal-hspa.svg"),
		OFF("signal-off.svg"),
		VARIANT("signal-variant.svg"),
		;
		private String name;

		SIGNAL(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum MUSIC implements SimpleIcon {
		BOX_OUTLINE("music-box-outline.svg"),
		BOX("music-box.svg"),
		CIRCLE_OUTLINE("music-circle-outline.svg"),
		CIRCLE("music-circle.svg"),
		NOTE_BLUETOOTH_OFF("music-note-bluetooth-off.svg"),
		NOTE_BLUETOOTH("music-note-bluetooth.svg"),
		NOTE_EIGHTH("music-note-eighth.svg"),
		NOTE_HALF("music-note-half.svg"),
		NOTE_OFF("music-note-off.svg"),
		NOTE_PLUS("music-note-plus.svg"),
		NOTE_QUARTER("music-note-quarter.svg"),
		NOTE_SIXTEENTH("music-note-sixteenth.svg"),
		NOTE_WHOLE("music-note-whole.svg"),
		NOTE("music-note.svg"),
		OFF("music-off.svg"),
		;
		private String name;

		MUSIC(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum GAMEPAD implements SimpleIcon {
		CIRCLE_DOWN("gamepad-circle-down.svg"),
		CIRCLE_LEFT("gamepad-circle-left.svg"),
		CIRCLE_OUTLINE("gamepad-circle-outline.svg"),
		CIRCLE_RIGHT("gamepad-circle-right.svg"),
		CIRCLE_UP("gamepad-circle-up.svg"),
		CIRCLE("gamepad-circle.svg"),
		DOWN("gamepad-down.svg"),
		LEFT("gamepad-left.svg"),
		RIGHT("gamepad-right.svg"),
		ROUND_DOWN("gamepad-round-down.svg"),
		ROUND_LEFT("gamepad-round-left.svg"),
		ROUND_OUTLINE("gamepad-round-outline.svg"),
		ROUND_RIGHT("gamepad-round-right.svg"),
		ROUND_UP("gamepad-round-up.svg"),
		ROUND("gamepad-round.svg"),
		UP("gamepad-up.svg"),
		VARIANT("gamepad-variant.svg"),
		;
		private String name;

		GAMEPAD(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum NUMERIC implements SimpleIcon {
		_0_BOX_MULTIPLE_OUTLINE("numeric-0-box-multiple-outline.svg"),
		_0_BOX_OUTLINE("numeric-0-box-outline.svg"),
		_0_BOX("numeric-0-box.svg"),
		_0_CIRCLE_OUTLINE("numeric-0-circle-outline.svg"),
		_0_CIRCLE("numeric-0-circle.svg"),
		_0("numeric-0.svg"),
		_1_BOX_MULTIPLE_OUTLINE("numeric-1-box-multiple-outline.svg"),
		_1_BOX_OUTLINE("numeric-1-box-outline.svg"),
		_1_BOX("numeric-1-box.svg"),
		_1_CIRCLE_OUTLINE("numeric-1-circle-outline.svg"),
		_1_CIRCLE("numeric-1-circle.svg"),
		_1("numeric-1.svg"),
		_10_BOX_OUTLINE("numeric-10-box-outline.svg"),
		_10_BOX("numeric-10-box.svg"),
		_2_BOX_MULTIPLE_OUTLINE("numeric-2-box-multiple-outline.svg"),
		_2_BOX_OUTLINE("numeric-2-box-outline.svg"),
		_2_BOX("numeric-2-box.svg"),
		_2_CIRCLE_OUTLINE("numeric-2-circle-outline.svg"),
		_2_CIRCLE("numeric-2-circle.svg"),
		_2("numeric-2.svg"),
		_3_BOX_MULTIPLE_OUTLINE("numeric-3-box-multiple-outline.svg"),
		_3_BOX_OUTLINE("numeric-3-box-outline.svg"),
		_3_BOX("numeric-3-box.svg"),
		_3_CIRCLE_OUTLINE("numeric-3-circle-outline.svg"),
		_3_CIRCLE("numeric-3-circle.svg"),
		_3("numeric-3.svg"),
		_4_BOX_MULTIPLE_OUTLINE("numeric-4-box-multiple-outline.svg"),
		_4_BOX_OUTLINE("numeric-4-box-outline.svg"),
		_4_BOX("numeric-4-box.svg"),
		_4_CIRCLE_OUTLINE("numeric-4-circle-outline.svg"),
		_4_CIRCLE("numeric-4-circle.svg"),
		_4("numeric-4.svg"),
		_5_BOX_MULTIPLE_OUTLINE("numeric-5-box-multiple-outline.svg"),
		_5_BOX_OUTLINE("numeric-5-box-outline.svg"),
		_5_BOX("numeric-5-box.svg"),
		_5_CIRCLE_OUTLINE("numeric-5-circle-outline.svg"),
		_5_CIRCLE("numeric-5-circle.svg"),
		_5("numeric-5.svg"),
		_6_BOX_MULTIPLE_OUTLINE("numeric-6-box-multiple-outline.svg"),
		_6_BOX_OUTLINE("numeric-6-box-outline.svg"),
		_6_BOX("numeric-6-box.svg"),
		_6_CIRCLE_OUTLINE("numeric-6-circle-outline.svg"),
		_6_CIRCLE("numeric-6-circle.svg"),
		_6("numeric-6.svg"),
		_7_BOX_MULTIPLE_OUTLINE("numeric-7-box-multiple-outline.svg"),
		_7_BOX_OUTLINE("numeric-7-box-outline.svg"),
		_7_BOX("numeric-7-box.svg"),
		_7_CIRCLE_OUTLINE("numeric-7-circle-outline.svg"),
		_7_CIRCLE("numeric-7-circle.svg"),
		_7("numeric-7.svg"),
		_8_BOX_MULTIPLE_OUTLINE("numeric-8-box-multiple-outline.svg"),
		_8_BOX_OUTLINE("numeric-8-box-outline.svg"),
		_8_BOX("numeric-8-box.svg"),
		_8_CIRCLE_OUTLINE("numeric-8-circle-outline.svg"),
		_8_CIRCLE("numeric-8-circle.svg"),
		_8("numeric-8.svg"),
		_9_BOX_MULTIPLE_OUTLINE("numeric-9-box-multiple-outline.svg"),
		_9_BOX_OUTLINE("numeric-9-box-outline.svg"),
		_9_BOX("numeric-9-box.svg"),
		_9_CIRCLE_OUTLINE("numeric-9-circle-outline.svg"),
		_9_CIRCLE("numeric-9-circle.svg"),
		_9_PLUS_BOX_MULTIPLE_OUTLINE("numeric-9-plus-box-multiple-outline.svg"),
		_9_PLUS_BOX_OUTLINE("numeric-9-plus-box-outline.svg"),
		_9_PLUS_BOX("numeric-9-plus-box.svg"),
		_9_PLUS_CIRCLE_OUTLINE("numeric-9-plus-circle-outline.svg"),
		_9_PLUS_CIRCLE("numeric-9-plus-circle.svg"),
		_9("numeric-9.svg"),
		;
		private String name;

		NUMERIC(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum WEATHER implements SimpleIcon {
		CLOUDY_ARROW_RIGHT("weather-cloudy-arrow-right.svg"),
		CLOUDY("weather-cloudy.svg"),
		FOG("weather-fog.svg"),
		HAIL("weather-hail.svg"),
		LIGHTNING_RAINY("weather-lightning-rainy.svg"),
		LIGHTNING("weather-lightning.svg"),
		NIGHT("weather-night.svg"),
		PARTLYCLOUDY("weather-partlycloudy.svg"),
		POURING("weather-pouring.svg"),
		RAINY("weather-rainy.svg"),
		SNOWY_RAINY("weather-snowy-rainy.svg"),
		SNOWY("weather-snowy.svg"),
		SUNNY("weather-sunny.svg"),
		SUNSET_DOWN("weather-sunset-down.svg"),
		SUNSET_UP("weather-sunset-up.svg"),
		SUNSET("weather-sunset.svg"),
		WINDY_VARIANT("weather-windy-variant.svg"),
		WINDY("weather-windy.svg"),
		;
		private String name;

		WEATHER(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum POWER implements SimpleIcon {
		CYCLE("power-cycle.svg"),
		OFF("power-off.svg"),
		ON("power-on.svg"),
		PLUG_OFF("power-plug-off.svg"),
		PLUG("power-plug.svg"),
		SETTINGS("power-settings.svg"),
		SLEEP("power-sleep.svg"),
		SOCKET_AU("power-socket-au.svg"),
		SOCKET_EU("power-socket-eu.svg"),
		SOCKET_UK("power-socket-uk.svg"),
		SOCKET_US("power-socket-us.svg"),
		SOCKET("power-socket.svg"),
		STANDBY("power-standby.svg"),
		;
		private String name;

		POWER(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CHART implements SimpleIcon {
		ARC("chart-arc.svg"),
		AREASPLINE("chart-areaspline.svg"),
		BAR_STACKED("chart-bar-stacked.svg"),
		BAR("chart-bar.svg"),
		BELL_CURVE("chart-bell-curve.svg"),
		BUBBLE("chart-bubble.svg"),
		DONUT_VARIANT("chart-donut-variant.svg"),
		DONUT("chart-donut.svg"),
		GANTT("chart-gantt.svg"),
		HISTOGRAM("chart-histogram.svg"),
		LINE_STACKED("chart-line-stacked.svg"),
		LINE_VARIANT("chart-line-variant.svg"),
		LINE("chart-line.svg"),
		MULTILINE("chart-multiline.svg"),
		PIE("chart-pie.svg"),
		SCATTERPLOT_HEXBIN("chart-scatterplot-hexbin.svg"),
		TIMELINE("chart-timeline.svg"),
		;
		private String name;

		CHART(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum VECTOR implements SimpleIcon {
		ARRANGE_ABOVE("vector-arrange-above.svg"),
		ARRANGE_BELOW("vector-arrange-below.svg"),
		BEZIER("vector-bezier.svg"),
		CIRCLE_VARIANT("vector-circle-variant.svg"),
		CIRCLE("vector-circle.svg"),
		COMBINE("vector-combine.svg"),
		CURVE("vector-curve.svg"),
		DIFFERENCE_AB("vector-difference-ab.svg"),
		DIFFERENCE_BA("vector-difference-ba.svg"),
		DIFFERENCE("vector-difference.svg"),
		ELLIPSE("vector-ellipse.svg"),
		INTERSECTION("vector-intersection.svg"),
		LINE("vector-line.svg"),
		POINT("vector-point.svg"),
		POLYGON("vector-polygon.svg"),
		POLYLINE("vector-polyline.svg"),
		RADIUS("vector-radius.svg"),
		RECTANGLE("vector-rectangle.svg"),
		SELECTION("vector-selection.svg"),
		SQUARE("vector-square.svg"),
		TRIANGLE("vector-triangle.svg"),
		UNION("vector-union.svg"),
		;
		private String name;

		VECTOR(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum CODE implements SimpleIcon {
		ARRAY("code-array.svg"),
		BRACES("code-braces.svg"),
		BRACKETS("code-brackets.svg"),
		EQUAL("code-equal.svg"),
		GREATER_THAN_OR_EQUAL("code-greater-than-or-equal.svg"),
		GREATER_THAN("code-greater-than.svg"),
		LESS_THAN_OR_EQUAL("code-less-than-or-equal.svg"),
		LESS_THAN("code-less-than.svg"),
		NOT_EQUAL_VARIANT("code-not-equal-variant.svg"),
		NOT_EQUAL("code-not-equal.svg"),
		PARENTHESES("code-parentheses.svg"),
		STRING("code-string.svg"),
		TAGS_CHECK("code-tags-check.svg"),
		TAGS("code-tags.svg"),
		;
		private String name;

		CODE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum STAR implements SimpleIcon {
		BOX_OUTLINE("star-box-outline.svg"),
		BOX("star-box.svg"),
		CIRCLE_OUTLINE("star-circle-outline.svg"),
		CIRCLE("star-circle.svg"),
		FACE("star-face.svg"),
		FOUR_POINTS_OUTLINE("star-four-points-outline.svg"),
		FOUR_POINTS("star-four-points.svg"),
		HALF("star-half.svg"),
		OF_DAVID("star-of-david.svg"),
		OFF("star-off.svg"),
		OUTLINE("star-outline.svg"),
		THREE_POINTS_OUTLINE("star-three-points-outline.svg"),
		THREE_POINTS("star-three-points.svg"),
		;
		private String name;

		STAR(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum BOOK implements SimpleIcon {
		LOCK_OPEN("book-lock-open.svg"),
		LOCK("book-lock.svg"),
		MINUS("book-minus.svg"),
		MULTIPLE_MINUS("book-multiple-minus.svg"),
		MULTIPLE_PLUS("book-multiple-plus.svg"),
		MULTIPLE_REMOVE("book-multiple-remove.svg"),
		MULTIPLE_VARIANT("book-multiple-variant.svg"),
		MULTIPLE("book-multiple.svg"),
		OPEN_OUTLINE("book-open-outline.svg"),
		OPEN_PAGE_VARIANT("book-open-page-variant.svg"),
		OPEN_VARIANT("book-open-variant.svg"),
		OPEN("book-open.svg"),
		OUTLINE("book-outline.svg"),
		PLUS("book-plus.svg"),
		REMOVE("book-remove.svg"),
		VARIANT("book-variant.svg"),
		;
		private String name;

		BOOK(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum GESTURE implements SimpleIcon {
		DOUBLE_TAP("gesture-double-tap.svg"),
		PINCH("gesture-pinch.svg"),
		SPREAD("gesture-spread.svg"),
		SWIPE_DOWN("gesture-swipe-down.svg"),
		SWIPE_HORIZONTAL("gesture-swipe-horizontal.svg"),
		SWIPE_LEFT("gesture-swipe-left.svg"),
		SWIPE_RIGHT("gesture-swipe-right.svg"),
		SWIPE_UP("gesture-swipe-up.svg"),
		SWIPE_VERTICAL("gesture-swipe-vertical.svg"),
		SWIPE("gesture-swipe.svg"),
		TAP_HOLD("gesture-tap-hold.svg"),
		TAP("gesture-tap.svg"),
		TWO_DOUBLE_TAP("gesture-two-double-tap.svg"),
		TWO_TAP("gesture-two-tap.svg"),
		;
		private String name;

		GESTURE(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum PENCIL implements SimpleIcon {
		BOX_OUTLINE("pencil-box-outline.svg"),
		BOX("pencil-box.svg"),
		CIRCLE_OUTLINE("pencil-circle-outline.svg"),
		CIRCLE("pencil-circle.svg"),
		LOCK_OUTLINE("pencil-lock-outline.svg"),
		LOCK("pencil-lock.svg"),
		MINUS_OUTLINE("pencil-minus-outline.svg"),
		MINUS("pencil-minus.svg"),
		OFF_OUTLINE("pencil-off-outline.svg"),
		OFF("pencil-off.svg"),
		OUTLINE("pencil-outline.svg"),
		PLUS_OUTLINE("pencil-plus-outline.svg"),
		PLUS("pencil-plus.svg"),
		REMOVE_OUTLINE("pencil-remove-outline.svg"),
		REMOVE("pencil-remove.svg"),
		;
		private String name;

		PENCIL(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum XBOX implements SimpleIcon {
		CONTROLLER_BATTERY_ALERT("xbox-controller-battery-alert.svg"),
		CONTROLLER_BATTERY_CHARGING("xbox-controller-battery-charging.svg"),
		CONTROLLER_BATTERY_EMPTY("xbox-controller-battery-empty.svg"),
		CONTROLLER_BATTERY_FULL("xbox-controller-battery-full.svg"),
		CONTROLLER_BATTERY_LOW("xbox-controller-battery-low.svg"),
		CONTROLLER_BATTERY_MEDIUM("xbox-controller-battery-medium.svg"),
		CONTROLLER_BATTERY_UNKNOWN("xbox-controller-battery-unknown.svg"),
		CONTROLLER_MENU("xbox-controller-menu.svg"),
		CONTROLLER_OFF("xbox-controller-off.svg"),
		CONTROLLER_VIEW("xbox-controller-view.svg"),
		CONTROLLER("xbox-controller.svg"),
		;
		private String name;

		XBOX(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum MENU implements SimpleIcon {
		CLOSE("menu-close.svg"),
		DOWN_OUTLINE("menu-down-outline.svg"),
		DOWN("menu-down.svg"),
		LEFT_OUTLINE("menu-left-outline.svg"),
		LEFT("menu-left.svg"),
		RIGHT_OUTLINE("menu-right-outline.svg"),
		RIGHT("menu-right.svg"),
		SWAP_OUTLINE("menu-swap-outline.svg"),
		SWAP("menu-swap.svg"),
		UP_OUTLINE("menu-up-outline.svg"),
		UP("menu-up.svg"),
		;
		private String name;

		MENU(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum PAN implements SimpleIcon {
		BOTTOM_LEFT("pan-bottom-left.svg"),
		BOTTOM_RIGHT("pan-bottom-right.svg"),
		DOWN("pan-down.svg"),
		HORIZONTAL("pan-horizontal.svg"),
		LEFT("pan-left.svg"),
		RIGHT("pan-right.svg"),
		TOP_LEFT("pan-top-left.svg"),
		TOP_RIGHT("pan-top-right.svg"),
		UP("pan-up.svg"),
		VERTICAL("pan-vertical.svg"),
		;
		private String name;

		PAN(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum DEFAULT implements SimpleIcon {
		ACCESS_POINT_NETWORK_OFF("access-point-network-off.svg"),
		ACCESS_POINT_NETWORK("access-point-network.svg"),
		ACCESS_POINT("access-point.svg"),
		ACCOUNT("account.svg"),
		ACCUSOFT("accusoft.svg"),
		AD_CHOICES("ad-choices.svg"),
		ADJUST("adjust.svg"),
		ADOBE("adobe.svg"),
		AIR_CONDITIONER("air-conditioner.svg"),
		AIR_FILTER("air-filter.svg"),
		AIR_HORN("air-horn.svg"),
		AIR_PURIFIER("air-purifier.svg"),
		AIRBAG("airbag.svg"),
		AIRBALLOON("airballoon.svg"),
		AIRPLANE_LANDING("airplane-landing.svg"),
		AIRPLANE_OFF("airplane-off.svg"),
		AIRPLANE_TAKEOFF("airplane-takeoff.svg"),
		AIRPLANE("airplane.svg"),
		AIRPLAY("airplay.svg"),
		AIRPORT("airport.svg"),
		ALARM_BELL("alarm-bell.svg"),
		ALARM_CHECK("alarm-check.svg"),
		ALARM_LIGHT_OUTLINE("alarm-light-outline.svg"),
		ALARM_LIGHT("alarm-light.svg"),
		ALARM_MULTIPLE("alarm-multiple.svg"),
		ALARM_OFF("alarm-off.svg"),
		ALARM_PLUS("alarm-plus.svg"),
		ALARM_SNOOZE("alarm-snooze.svg"),
		ALARM("alarm.svg"),
		ALBUM("album.svg"),
		ALERT("alert.svg"),
		ALIEN("alien.svg"),
		ALL_INCLUSIVE("all-inclusive.svg"),
		ALLO("allo.svg"),
		ALPHA("alpha.svg"),
		ALPHABETICAL("alphabetical.svg"),
		ALTIMETER("altimeter.svg"),
		AMAZON_ALEXA("amazon-alexa.svg"),
		AMAZON_CLOUDDRIVE("amazon-clouddrive.svg"),
		AMAZON("amazon.svg"),
		AMBULANCE("ambulance.svg"),
		AMMUNITION("ammunition.svg"),
		AMPERSAND("ampersand.svg"),
		AMPLIFIER("amplifier.svg"),
		ANCHOR("anchor.svg"),
		ANDROID_AUTO("android-auto.svg"),
		ANDROID_DEBUG_BRIDGE("android-debug-bridge.svg"),
		ANDROID_HEAD("android-head.svg"),
		ANDROID_MESSAGES("android-messages.svg"),
		ANDROID_STUDIO("android-studio.svg"),
		ANDROID("android.svg"),
		ANGLE_ACUTE("angle-acute.svg"),
		ANGLE_OBTUSE("angle-obtuse.svg"),
		ANGLE_RIGHT("angle-right.svg"),
		ANGULAR("angular.svg"),
		ANGULARJS("angularjs.svg"),
		ANIMATION_OUTLINE("animation-outline.svg"),
		ANIMATION_PLAY_OUTLINE("animation-play-outline.svg"),
		ANIMATION_PLAY("animation-play.svg"),
		ANIMATION("animation.svg"),
		ANVIL("anvil.svg"),
		APPLE_FINDER("apple-finder.svg"),
		APPLE_IOS("apple-ios.svg"),
		APPLE_KEYBOARD_CAPS("apple-keyboard-caps.svg"),
		APPLE_KEYBOARD_COMMAND("apple-keyboard-command.svg"),
		APPLE_KEYBOARD_CONTROL("apple-keyboard-control.svg"),
		APPLE_KEYBOARD_OPTION("apple-keyboard-option.svg"),
		APPLE_KEYBOARD_SHIFT("apple-keyboard-shift.svg"),
		APPLE_MOBILEME("apple-mobileme.svg"),
		APPLE_SAFARI("apple-safari.svg"),
		APPLE("apple.svg"),
		APPLICATION_EXPORT("application-export.svg"),
		APPLICATION_IMPORT("application-import.svg"),
		APPLICATION("application.svg"),
		APPNET("appnet.svg"),
		APPROVAL("approval.svg"),
		APPS_BOX("apps-box.svg"),
		APPS("apps.svg"),
		ARCH("arch.svg"),
		ARCHIVE("archive.svg"),
		ARRANGE_BRING_FORWARD("arrange-bring-forward.svg"),
		ARRANGE_BRING_TO_FRONT("arrange-bring-to-front.svg"),
		ARRANGE_SEND_BACKWARD("arrange-send-backward.svg"),
		ARRANGE_SEND_TO_BACK("arrange-send-to-back.svg"),
		ARTIST_OUTLINE("artist-outline.svg"),
		ARTIST("artist.svg"),
		ARTSTATION("artstation.svg"),
		ASPECT_RATIO("aspect-ratio.svg"),
		ASSISTANT("assistant.svg"),
		ASTERISK("asterisk.svg"),
		AT("at.svg"),
		ATLASSIAN("atlassian.svg"),
		ATM("atm.svg"),
		ATOM("atom.svg"),
		ATTACHMENT("attachment.svg"),
		AUDIO_VIDEO("audio-video.svg"),
		AUDIOBOOK("audiobook.svg"),
		AUGMENTED_REALITY("augmented-reality.svg"),
		AUTO_FIX("auto-fix.svg"),
		AUTO_UPLOAD("auto-upload.svg"),
		AUTORENEW("autorenew.svg"),
		AV_TIMER("av-timer.svg"),
		AWS("aws.svg"),
		AXE("axe.svg"),
		AXIS("axis.svg"),
		AZURE("azure.svg"),
		BABEL("babel.svg"),
		BABY_BUGGY("baby-buggy.svg"),
		BABY("baby.svg"),
		BACKBURGER("backburger.svg"),
		BACKSPACE_OUTLINE("backspace-outline.svg"),
		BACKSPACE("backspace.svg"),
		BACKUP_RESTORE("backup-restore.svg"),
		BADMINTON("badminton.svg"),
		BAG_PERSONAL_OFF_OUTLINE("bag-personal-off-outline.svg"),
		BAG_PERSONAL_OFF("bag-personal-off.svg"),
		BAG_PERSONAL_OUTLINE("bag-personal-outline.svg"),
		BAG_PERSONAL("bag-personal.svg"),
		BALLOON("balloon.svg"),
		BALLOT_OUTLINE("ballot-outline.svg"),
		BALLOT_RECOUNT_OUTLINE("ballot-recount-outline.svg"),
		BALLOT_RECOUNT("ballot-recount.svg"),
		BALLOT("ballot.svg"),
		BANDAGE("bandage.svg"),
		BANDCAMP("bandcamp.svg"),
		BANK_MINUS("bank-minus.svg"),
		BANK_PLUS("bank-plus.svg"),
		BANK_REMOVE("bank-remove.svg"),
		BANK_TRANSFER_IN("bank-transfer-in.svg"),
		BANK_TRANSFER_OUT("bank-transfer-out.svg"),
		BANK_TRANSFER("bank-transfer.svg"),
		BANK("bank.svg"),
		BARCODE_SCAN("barcode-scan.svg"),
		BARCODE("barcode.svg"),
		BARLEY_OFF("barley-off.svg"),
		BARLEY("barley.svg"),
		BARN("barn.svg"),
		BARREL("barrel.svg"),
		BASEBALL_BAT("baseball-bat.svg"),
		BASEBALL("baseball.svg"),
		BASECAMP("basecamp.svg"),
		BASKET_FILL("basket-fill.svg"),
		BASKET_UNFILL("basket-unfill.svg"),
		BASKET("basket.svg"),
		BASKETBALL_HOOP_OUTLINE("basketball-hoop-outline.svg"),
		BASKETBALL_HOOP("basketball-hoop.svg"),
		BASKETBALL("basketball.svg"),
		BAT("bat.svg"),
		BATTERY("battery.svg"),
		BATTLENET("battlenet.svg"),
		BEACH("beach.svg"),
		BEAKER_OUTLINE("beaker-outline.svg"),
		BEAKER("beaker.svg"),
		BEAM("beam.svg"),
		BEATS("beats.svg"),
		BED_EMPTY("bed-empty.svg"),
		BEER("beer.svg"),
		BEHANCE("behance.svg"),
		BELL("bell.svg"),
		BETA("beta.svg"),
		BETAMAX("betamax.svg"),
		BIATHLON("biathlon.svg"),
		BIBLE("bible.svg"),
		BIKE("bike.svg"),
		BILLIARDS_RACK("billiards-rack.svg"),
		BILLIARDS("billiards.svg"),
		BING("bing.svg"),
		BINOCULARS("binoculars.svg"),
		BIO("bio.svg"),
		BITBUCKET("bitbucket.svg"),
		BITCOIN("bitcoin.svg"),
		BLACK_MESA("black-mesa.svg"),
		BLACKBERRY("blackberry.svg"),
		BLENDER_SOFTWARE("blender-software.svg"),
		BLENDER("blender.svg"),
		BLINDS("blinds.svg"),
		BLOCK_HELPER("block-helper.svg"),
		BLOGGER("blogger.svg"),
		BLOOD_BAG("blood-bag.svg"),
		BLUETOOTH_AUDIO("bluetooth-audio.svg"),
		BLUETOOTH_CONNECT("bluetooth-connect.svg"),
		BLUETOOTH_OFF("bluetooth-off.svg"),
		BLUETOOTH_SETTINGS("bluetooth-settings.svg"),
		BLUETOOTH_TRANSFER("bluetooth-transfer.svg"),
		BLUETOOTH("bluetooth.svg"),
		BLUR_LINEAR("blur-linear.svg"),
		BLUR_OFF("blur-off.svg"),
		BLUR_RADIAL("blur-radial.svg"),
		BLUR("blur.svg"),
		BOLNISI_CROSS("bolnisi-cross.svg"),
		BOLT("bolt.svg"),
		BOMB_OFF("bomb-off.svg"),
		BOMB("bomb.svg"),
		BONE("bone.svg"),
		BOOK("book.svg"),
		BOOKMARK("bookmark.svg"),
		BOOMBOX("boombox.svg"),
		BOOTSTRAP("bootstrap.svg"),
		BOTTLE_WINE("bottle-wine.svg"),
		BOW_TIE("bow-tie.svg"),
		BOWL("bowl.svg"),
		BOWLING("bowling.svg"),
		BOX_CUTTER("box-cutter.svg"),
		BOX_DOWNLOAD("box-download.svg"),
		BOX_SHADOW("box-shadow.svg"),
		BOX_UPLOAD("box-upload.svg"),
		BOX("box.svg"),
		BOXING_GLOVES("boxing-gloves.svg"),
		BRAILLE("braille.svg"),
		BRAIN("brain.svg"),
		BREAD_SLICE_OUTLINE("bread-slice-outline.svg"),
		BREAD_SLICE("bread-slice.svg"),
		BRIDGE("bridge.svg"),
		BRIEFCASE("briefcase.svg"),
		BRIGHTNESS_1("brightness-1.svg"),
		BRIGHTNESS_2("brightness-2.svg"),
		BRIGHTNESS_3("brightness-3.svg"),
		BRIGHTNESS_4("brightness-4.svg"),
		BRIGHTNESS_5("brightness-5.svg"),
		BRIGHTNESS_6("brightness-6.svg"),
		BRIGHTNESS_7("brightness-7.svg"),
		BRIGHTNESS_AUTO("brightness-auto.svg"),
		BRIGHTNESS_PERCENT("brightness-percent.svg"),
		BRIGHTNESS("brightness.svg"),
		BROOM("broom.svg"),
		BRUSH("brush.svg"),
		BUDDHISM("buddhism.svg"),
		BUFFER("buffer.svg"),
		BUG_CHECK_OUTLINE("bug-check-outline.svg"),
		BUG_CHECK("bug-check.svg"),
		BUG_OUTLINE("bug-outline.svg"),
		BUG("bug.svg"),
		BUGLE("bugle.svg"),
		BULLDOZER("bulldozer.svg"),
		BULLET("bullet.svg"),
		BULLETIN_BOARD("bulletin-board.svg"),
		BULLHORN_OUTLINE("bullhorn-outline.svg"),
		BULLHORN("bullhorn.svg"),
		BULLSEYE_ARROW("bullseye-arrow.svg"),
		BULLSEYE("bullseye.svg"),
		BURST_MODE("burst-mode.svg"),
		BUS_ALERT("bus-alert.svg"),
		BUS_ARTICULATED_END("bus-articulated-end.svg"),
		BUS_ARTICULATED_FRONT("bus-articulated-front.svg"),
		BUS_CLOCK("bus-clock.svg"),
		BUS_DOUBLE_DECKER("bus-double-decker.svg"),
		BUS_SCHOOL("bus-school.svg"),
		BUS_SIDE("bus-side.svg"),
		BUS("bus.svg"),
		CACHED("cached.svg"),
		CACTUS("cactus.svg"),
		CAKE_LAYERED("cake-layered.svg"),
		CAKE_VARIANT("cake-variant.svg"),
		CAKE("cake.svg"),
		CALCULATOR_OFF("calculator-off.svg"),
		CALCULATOR_VARIANT("calculator-variant.svg"),
		CALCULATOR("calculator.svg"),
		CALENDAR("calendar.svg"),
		CALL_MADE("call-made.svg"),
		CALL_MERGE("call-merge.svg"),
		CALL_MISSED("call-missed.svg"),
		CALL_RECEIVED("call-received.svg"),
		CALL_SPLIT("call-split.svg"),
		CAMCORDER_BOX_OFF("camcorder-box-off.svg"),
		CAMCORDER_BOX("camcorder-box.svg"),
		CAMCORDER_OFF("camcorder-off.svg"),
		CAMCORDER("camcorder.svg"),
		CAMERA("camera.svg"),
		CANCEL("cancel.svg"),
		CANDLE("candle.svg"),
		CANDYCANE("candycane.svg"),
		CANNABIS("cannabis.svg"),
		CAPS_LOCK("caps-lock.svg"),
		CAR("car.svg"),
		CARAVAN("caravan.svg"),
		CARD_BULLETED_OFF_OUTLINE("card-bulleted-off-outline.svg"),
		CARD_BULLETED_OFF("card-bulleted-off.svg"),
		CARD_BULLETED_OUTLINE("card-bulleted-outline.svg"),
		CARD_BULLETED_SETTINGS_OUTLINE("card-bulleted-settings-outline.svg"),
		CARD_BULLETED_SETTINGS("card-bulleted-settings.svg"),
		CARD_BULLETED("card-bulleted.svg"),
		CARD_OUTLINE("card-outline.svg"),
		CARD_TEXT_OUTLINE("card-text-outline.svg"),
		CARD_TEXT("card-text.svg"),
		CARD("card.svg"),
		CARDS_CLUB("cards-club.svg"),
		CARDS_DIAMOND("cards-diamond.svg"),
		CARDS_HEART("cards-heart.svg"),
		CARDS_OUTLINE("cards-outline.svg"),
		CARDS_PLAYING_OUTLINE("cards-playing-outline.svg"),
		CARDS_SPADE("cards-spade.svg"),
		CARDS_VARIANT("cards-variant.svg"),
		CARDS("cards.svg"),
		CARROT("carrot.svg"),
		CARRY_ON_BAG_CHECK("carry-on-bag-check.svg"),
		CART_ARROW_DOWN("cart-arrow-down.svg"),
		CART_ARROW_RIGHT("cart-arrow-right.svg"),
		CART_ARROW_UP("cart-arrow-up.svg"),
		CART_MINUS("cart-minus.svg"),
		CART_OFF("cart-off.svg"),
		CART_OUTLINE("cart-outline.svg"),
		CART_PLUS("cart-plus.svg"),
		CART_REMOVE("cart-remove.svg"),
		CART("cart.svg"),
		CASH_100("cash-100.svg"),
		CASH_MARKER("cash-marker.svg"),
		CASH_MULTIPLE("cash-multiple.svg"),
		CASH_REFUND("cash-refund.svg"),
		CASH_REGISTER("cash-register.svg"),
		CASH_USD("cash-usd.svg"),
		CASH("cash.svg"),
		CASSETTE("cassette.svg"),
		CAST_CONNECTED("cast-connected.svg"),
		CAST_EDUCATION("cast-education.svg"),
		CAST_OFF("cast-off.svg"),
		CAST("cast.svg"),
		CASTLE("castle.svg"),
		CAT("cat.svg"),
		CCTV("cctv.svg"),
		CEILING_LIGHT("ceiling-light.svg"),
		CELLPHONE("cellphone.svg"),
		CELTIC_CROSS("celtic-cross.svg"),
		CERTIFICATE("certificate.svg"),
		CHAIR_SCHOOL("chair-school.svg"),
		CHARITY("charity.svg"),
		CHAT_ALERT("chat-alert.svg"),
		CHAT_PROCESSING("chat-processing.svg"),
		CHAT("chat.svg"),
		CHECK("check.svg"),
		CHECKBOOK("checkbook.svg"),
		CHECKERBOARD("checkerboard.svg"),
		CHEF_HAT("chef-hat.svg"),
		CHEMICAL_WEAPON("chemical-weapon.svg"),
		CHESS_BISHOP("chess-bishop.svg"),
		CHESS_KING("chess-king.svg"),
		CHESS_KNIGHT("chess-knight.svg"),
		CHESS_PAWN("chess-pawn.svg"),
		CHESS_QUEEN("chess-queen.svg"),
		CHESS_ROOK("chess-rook.svg"),
		CHILI_HOT("chili-hot.svg"),
		CHILI_MEDIUM("chili-medium.svg"),
		CHILI_MILD("chili-mild.svg"),
		CHIP("chip.svg"),
		CHRISTIANITY_OUTLINE("christianity-outline.svg"),
		CHRISTIANITY("christianity.svg"),
		CHURCH("church.svg"),
		CIRCLE("circle.svg"),
		CIRCULAR_SAW("circular-saw.svg"),
		CISCO_WEBEX("cisco-webex.svg"),
		CITY_VARIANT_OUTLINE("city-variant-outline.svg"),
		CITY_VARIANT("city-variant.svg"),
		CITY("city.svg"),
		CLAPPERBOARD("clapperboard.svg"),
		CLIPBOARD("clipboard.svg"),
		CLIPPY("clippy.svg"),
		CLOCK_ALERT_OUTLINE("clock-alert-outline.svg"),
		CLOCK_ALERT("clock-alert.svg"),
		CLOCK_END("clock-end.svg"),
		CLOCK_FAST("clock-fast.svg"),
		CLOCK_IN("clock-in.svg"),
		CLOCK_OUT("clock-out.svg"),
		CLOCK_OUTLINE("clock-outline.svg"),
		CLOCK_START("clock-start.svg"),
		CLOCK("clock.svg"),
		CLOSE_BOX_MULTIPLE_OUTLINE("close-box-multiple-outline.svg"),
		CLOSE_BOX_MULTIPLE("close-box-multiple.svg"),
		CLOSE_CIRCLE_OUTLINE("close-circle-outline.svg"),
		CLOSE_CIRCLE("close-circle.svg"),
		CLOSE_NETWORK_OUTLINE("close-network-outline.svg"),
		CLOSE_NETWORK("close-network.svg"),
		CLOSE_OCTAGON_OUTLINE("close-octagon-outline.svg"),
		CLOSE_OCTAGON("close-octagon.svg"),
		CLOSE_OUTLINE("close-outline.svg"),
		CLOSE("close.svg"),
		CLOSED_CAPTION_OUTLINE("closed-caption-outline.svg"),
		CLOSED_CAPTION("closed-caption.svg"),
		CLOUD("cloud.svg"),
		CLOVER("clover.svg"),
		CODEPEN("codepen.svg"),
		COFFEE_OUTLINE("coffee-outline.svg"),
		COFFEE_TO_GO("coffee-to-go.svg"),
		COFFEE("coffee.svg"),
		COFFIN("coffin.svg"),
		COGS("cogs.svg"),
		COIN("coin.svg"),
		COINS("coins.svg"),
		COLLAGE("collage.svg"),
		COLLAPSE_ALL_OUTLINE("collapse-all-outline.svg"),
		COLLAPSE_ALL("collapse-all.svg"),
		COLOR_HELPER("color-helper.svg"),
		COMMA_BOX_OUTLINE("comma-box-outline.svg"),
		COMMA_BOX("comma-box.svg"),
		COMMA_CIRCLE_OUTLINE("comma-circle-outline.svg"),
		COMMA_CIRCLE("comma-circle.svg"),
		COMMA("comma.svg"),
		COMMENT("comment.svg"),
		COMPARE("compare.svg"),
		COMPASS_OFF_OUTLINE("compass-off-outline.svg"),
		COMPASS_OFF("compass-off.svg"),
		COMPASS_OUTLINE("compass-outline.svg"),
		COMPASS("compass.svg"),
		CONSOLE_LINE("console-line.svg"),
		CONSOLE_NETWORK_OUTLINE("console-network-outline.svg"),
		CONSOLE_NETWORK("console-network.svg"),
		CONSOLE("console.svg"),
		CONTACT_MAIL("contact-mail.svg"),
		CONTACTLESS_PAYMENT("contactless-payment.svg"),
		CONTACTS("contacts.svg"),
		CONTAIN_END("contain-end.svg"),
		CONTAIN_START("contain-start.svg"),
		CONTAIN("contain.svg"),
		CONTRAST_BOX("contrast-box.svg"),
		CONTRAST_CIRCLE("contrast-circle.svg"),
		CONTRAST("contrast.svg"),
		CONTROLLER_CLASSIC_OUTLINE("controller-classic-outline.svg"),
		CONTROLLER_CLASSIC("controller-classic.svg"),
		CONTROLLER_XBOX("controller-xbox.svg"),
		COOKIE("cookie.svg"),
		COPYRIGHT("copyright.svg"),
		CORDOVA("cordova.svg"),
		CORN("corn.svg"),
		COUNTER("counter.svg"),
		COW("cow.svg"),
		CRANE("crane.svg"),
		CREATION("creation.svg"),
		CREATIVE_COMMONS("creative-commons.svg"),
		CREDIT_CARD_MARKER("credit-card-marker.svg"),
		CREDIT_CARD_MULTIPLE("credit-card-multiple.svg"),
		CREDIT_CARD_OFF("credit-card-off.svg"),
		CREDIT_CARD_PLUS("credit-card-plus.svg"),
		CREDIT_CARD_REFUND("credit-card-refund.svg"),
		CREDIT_CARD_SCAN("credit-card-scan.svg"),
		CREDIT_CARD_SETTINGS("credit-card-settings.svg"),
		CREDIT_CARD_WIRELESS("credit-card-wireless.svg"),
		CREDIT_CARD("credit-card.svg"),
		CRICKET("cricket.svg"),
		CROP_FREE("crop-free.svg"),
		CROP_LANDSCAPE("crop-landscape.svg"),
		CROP_PORTRAIT("crop-portrait.svg"),
		CROP_ROTATE("crop-rotate.svg"),
		CROP_SQUARE("crop-square.svg"),
		CROP("crop.svg"),
		CROSSHAIRS_GPS("crosshairs-gps.svg"),
		CROSSHAIRS("crosshairs.svg"),
		CROWN("crown.svg"),
		CRYENGINE("cryengine.svg"),
		CRYSTAL_BALL("crystal-ball.svg"),
		CUBE_OUTLINE("cube-outline.svg"),
		CUBE_SCAN("cube-scan.svg"),
		CUBE_SEND("cube-send.svg"),
		CUBE_UNFOLDED("cube-unfolded.svg"),
		CUBE("cube.svg"),
		CUP_OFF("cup-off.svg"),
		CUP_WATER("cup-water.svg"),
		CUP("cup.svg"),
		CUPCAKE("cupcake.svg"),
		CURLING("curling.svg"),
		CURRENT_AC("current-ac.svg"),
		CURRENT_DC("current-dc.svg"),
		CURSOR_DEFAULT_CLICK_OUTLINE("cursor-default-click-outline.svg"),
		CURSOR_DEFAULT_CLICK("cursor-default-click.svg"),
		CURSOR_DEFAULT_OUTLINE("cursor-default-outline.svg"),
		CURSOR_DEFAULT("cursor-default.svg"),
		CURSOR_MOVE("cursor-move.svg"),
		CURSOR_POINTER("cursor-pointer.svg"),
		CURSOR_TEXT("cursor-text.svg"),
		DATA("data.svg"),
		DATABASE("database.svg"),
		DEATH_STAR_VARIANT("death-star-variant.svg"),
		DEATH_STAR("death-star.svg"),
		DEATHLY_HALLOWS("deathly-hallows.svg"),
		DEBIAN("debian.svg"),
		DEBUG_STEP_INTO("debug-step-into.svg"),
		DEBUG_STEP_OUT("debug-step-out.svg"),
		DEBUG_STEP_OVER("debug-step-over.svg"),
		DECAGRAM_OUTLINE("decagram-outline.svg"),
		DECAGRAM("decagram.svg"),
		DECIMAL_DECREASE("decimal-decrease.svg"),
		DECIMAL_INCREASE("decimal-increase.svg"),
		DELETE("delete.svg"),
		DELTA("delta.svg"),
		DESK_LAMP("desk-lamp.svg"),
		DESKPHONE("deskphone.svg"),
		DESKTOP_CLASSIC("desktop-classic.svg"),
		DESKTOP_MAC_DASHBOARD("desktop-mac-dashboard.svg"),
		DESKTOP_MAC("desktop-mac.svg"),
		DESKTOP_TOWER_MONITOR("desktop-tower-monitor.svg"),
		DESKTOP_TOWER("desktop-tower.svg"),
		DETAILS("details.svg"),
		DEV_TO("dev-to.svg"),
		DEVELOPER_BOARD("developer-board.svg"),
		DEVIANTART("deviantart.svg"),
		DIALPAD("dialpad.svg"),
		DIAMETER_OUTLINE("diameter-outline.svg"),
		DIAMETER_VARIANT("diameter-variant.svg"),
		DIAMETER("diameter.svg"),
		DIAMOND_OUTLINE("diamond-outline.svg"),
		DIAMOND_STONE("diamond-stone.svg"),
		DIAMOND("diamond.svg"),
		DICE("dice.svg"),
		DICTIONARY("dictionary.svg"),
		DIP_SWITCH("dip-switch.svg"),
		DIRECTIONS_FORK("directions-fork.svg"),
		DIRECTIONS("directions.svg"),
		DISCORD("discord.svg"),
		DISHWASHER("dishwasher.svg"),
		DISK_ALERT("disk-alert.svg"),
		DISK_PLAYER("disk-player.svg"),
		DISK("disk.svg"),
		DISQUS_OUTLINE("disqus-outline.svg"),
		DISQUS("disqus.svg"),
		DIVING_FLIPPERS("diving-flippers.svg"),
		DIVING_HELMET("diving-helmet.svg"),
		DIVING_SCUBA_FLAG("diving-scuba-flag.svg"),
		DIVING_SCUBA_TANK_MULTIPLE("diving-scuba-tank-multiple.svg"),
		DIVING_SCUBA_TANK("diving-scuba-tank.svg"),
		DIVING_SCUBA("diving-scuba.svg"),
		DIVING_SNORKEL("diving-snorkel.svg"),
		DIVISION_BOX("division-box.svg"),
		DIVISION("division.svg"),
		DLNA("dlna.svg"),
		DNA("dna.svg"),
		DNS_OUTLINE("dns-outline.svg"),
		DNS("dns.svg"),
		DO_NOT_DISTURB_OFF("do-not-disturb-off.svg"),
		DO_NOT_DISTURB("do-not-disturb.svg"),
		DOCKER("docker.svg"),
		DOCTOR("doctor.svg"),
		DOCUMENT("document.svg"),
		DOG_SERVICE("dog-service.svg"),
		DOG_SIDE("dog-side.svg"),
		DOG("dog.svg"),
		DOLBY("dolby.svg"),
		DOMAIN_OFF("domain-off.svg"),
		DOMAIN("domain.svg"),
		DONKEY("donkey.svg"),
		DOOR_CLOSED("door-closed.svg"),
		DOOR_OPEN("door-open.svg"),
		DOOR("door.svg"),
		DOORBELL_VIDEO("doorbell-video.svg"),
		DOT_NET("dot-net.svg"),
		DOTS_HORIZONTAL_CIRCLE_OUTLINE("dots-horizontal-circle-outline.svg"),
		DOTS_HORIZONTAL_CIRCLE("dots-horizontal-circle.svg"),
		DOTS_HORIZONTAL("dots-horizontal.svg"),
		DOTS_VERTICAL_CIRCLE_OUTLINE("dots-vertical-circle-outline.svg"),
		DOTS_VERTICAL_CIRCLE("dots-vertical-circle.svg"),
		DOTS_VERTICAL("dots-vertical.svg"),
		DOUBAN("douban.svg"),
		DOWNLOAD_MULTIPLE("download-multiple.svg"),
		DOWNLOAD_NETWORK_OUTLINE("download-network-outline.svg"),
		DOWNLOAD_NETWORK("download-network.svg"),
		DOWNLOAD_OUTLINE("download-outline.svg"),
		DOWNLOAD("download.svg"),
		DRAG_HORIZONTAL("drag-horizontal.svg"),
		DRAG_VARIANT("drag-variant.svg"),
		DRAG_VERTICAL("drag-vertical.svg"),
		DRAG("drag.svg"),
		DRAMA_MASKS("drama-masks.svg"),
		DRAWING_BOX("drawing-box.svg"),
		DRAWING("drawing.svg"),
		DRIBBBLE_BOX("dribbble-box.svg"),
		DRIBBBLE("dribbble.svg"),
		DRONE("drone.svg"),
		DROPBOX("dropbox.svg"),
		DRUPAL("drupal.svg"),
		DUCK("duck.svg"),
		DUMBBELL("dumbbell.svg"),
		DUMP_TRUCK("dump-truck.svg"),
		EAR_HEARING_OFF("ear-hearing-off.svg"),
		EAR_HEARING("ear-hearing.svg"),
		EARTH_BOX_OFF("earth-box-off.svg"),
		EARTH_BOX("earth-box.svg"),
		EARTH_OFF("earth-off.svg"),
		EARTH("earth.svg"),
		EBAY("ebay.svg"),
		EDGE("edge.svg"),
		EGG_EASTER("egg-easter.svg"),
		EGG("egg.svg"),
		EIGHT_TRACK("eight-track.svg"),
		EJECT_OUTLINE("eject-outline.svg"),
		EJECT("eject.svg"),
		ELEPHANT("elephant.svg"),
		ELEVATION_DECLINE("elevation-decline.svg"),
		ELEVATION_RISE("elevation-rise.svg"),
		ELEVATOR("elevator.svg"),
		EMAIL("email.svg"),
		EMBER("ember.svg"),
		EMBY("emby.svg"),
		EMOTICON("emoticon.svg"),
		ENGINE_OFF_OUTLINE("engine-off-outline.svg"),
		ENGINE_OFF("engine-off.svg"),
		ENGINE_OUTLINE("engine-outline.svg"),
		ENGINE("engine.svg"),
		EQUAL_BOX("equal-box.svg"),
		EQUAL("equal.svg"),
		ERASER_VARIANT("eraser-variant.svg"),
		ERASER("eraser.svg"),
		ESCALATOR("escalator.svg"),
		ESLINT("eslint.svg"),
		ET("et.svg"),
		ETHERNET_CABLE_OFF("ethernet-cable-off.svg"),
		ETHERNET_CABLE("ethernet-cable.svg"),
		ETHERNET("ethernet.svg"),
		ETSY("etsy.svg"),
		EV_STATION("ev-station.svg"),
		EVENTBRITE("eventbrite.svg"),
		EVERNOTE("evernote.svg"),
		EXCLAMATION("exclamation.svg"),
		EXIT_RUN("exit-run.svg"),
		EXIT_TO_APP("exit-to-app.svg"),
		EXPAND_ALL_OUTLINE("expand-all-outline.svg"),
		EXPAND_ALL("expand-all.svg"),
		EXPONENT_BOX("exponent-box.svg"),
		EXPONENT("exponent.svg"),
		EXPORT_VARIANT("export-variant.svg"),
		EXPORT("export.svg"),
		EYE("eye.svg"),
		EYEDROPPER_VARIANT("eyedropper-variant.svg"),
		EYEDROPPER("eyedropper.svg"),
		FACE_AGENT("face-agent.svg"),
		FACE_OUTLINE("face-outline.svg"),
		FACE_PROFILE("face-profile.svg"),
		FACE_RECOGNITION("face-recognition.svg"),
		FACE("face.svg"),
		FACEBOOK_BOX("facebook-box.svg"),
		FACEBOOK_MESSENGER("facebook-messenger.svg"),
		FACEBOOK_WORKPLACE("facebook-workplace.svg"),
		FACEBOOK("facebook.svg"),
		FACTORY("factory.svg"),
		FAN_OFF("fan-off.svg"),
		FAN("fan.svg"),
		FAST_FORWARD_10("fast-forward-10.svg"),
		FAST_FORWARD_30("fast-forward-30.svg"),
		FAST_FORWARD_OUTLINE("fast-forward-outline.svg"),
		FAST_FORWARD("fast-forward.svg"),
		FAX("fax.svg"),
		FEATHER("feather.svg"),
		FEATURE_SEARCH_OUTLINE("feature-search-outline.svg"),
		FEATURE_SEARCH("feature-search.svg"),
		FEDORA("fedora.svg"),
		FERRY("ferry.svg"),
		FILE("file.svg"),
		FILL("fill.svg"),
		FILM("film.svg"),
		FILMSTRIP_OFF("filmstrip-off.svg"),
		FILMSTRIP("filmstrip.svg"),
		FILTER_OUTLINE("filter-outline.svg"),
		FILTER_REMOVE_OUTLINE("filter-remove-outline.svg"),
		FILTER_REMOVE("filter-remove.svg"),
		FILTER_VARIANT("filter-variant.svg"),
		FILTER("filter.svg"),
		FINANCE("finance.svg"),
		FIND_REPLACE("find-replace.svg"),
		FINGERPRINT("fingerprint.svg"),
		FIRE_TRUCK("fire-truck.svg"),
		FIRE("fire.svg"),
		FIREBASE("firebase.svg"),
		FIREPLACE_OFF("fireplace-off.svg"),
		FIREPLACE("fireplace.svg"),
		FIREWORK("firework.svg"),
		FISH("fish.svg"),
		FLAG_CHECKERED_VARIANT("flag-checkered-variant.svg"),
		FLAG_CHECKERED("flag-checkered.svg"),
		FLAG_MINUS("flag-minus.svg"),
		FLAG_OUTLINE_VARIANT("flag-outline-variant.svg"),
		FLAG_OUTLINE("flag-outline.svg"),
		FLAG_PLUS("flag-plus.svg"),
		FLAG_REMOVE("flag-remove.svg"),
		FLAG_TRIANGLE("flag-triangle.svg"),
		FLAG_VARIANT("flag-variant.svg"),
		FLAG("flag.svg"),
		FLARE("flare.svg"),
		FLASH_AUTO("flash-auto.svg"),
		FLASH_CIRCLE("flash-circle.svg"),
		FLASH_OFF("flash-off.svg"),
		FLASH_OUTLINE("flash-outline.svg"),
		FLASH_RED_EYE("flash-red-eye.svg"),
		FLASH("flash.svg"),
		FLASHLIGHT_OFF("flashlight-off.svg"),
		FLASHLIGHT("flashlight.svg"),
		FLASK_EMPTY_OUTLINE("flask-empty-outline.svg"),
		FLASK_EMPTY("flask-empty.svg"),
		FLASK_OUTLINE("flask-outline.svg"),
		FLASK("flask.svg"),
		FLATTR("flattr.svg"),
		FLICKR_AFTER("flickr-after.svg"),
		FLICKR_BEFORE("flickr-before.svg"),
		FLICKR("flickr.svg"),
		FLIP_TO_BACK("flip-to-back.svg"),
		FLIP_TO_FRONT("flip-to-front.svg"),
		FLOOR_1("floor-1.svg"),
		FLOOR_2("floor-2.svg"),
		FLOOR_3("floor-3.svg"),
		FLOOR_A("floor-a.svg"),
		FLOOR_B("floor-b.svg"),
		FLOOR_G("floor-g.svg"),
		FLOOR_L("floor-l.svg"),
		FLOOR_LAMP("floor-lamp.svg"),
		FLOOR_PLAN("floor-plan.svg"),
		FLOPPY_VARIANT("floppy-variant.svg"),
		FLOPPY("floppy.svg"),
		FLOWER_OUTLINE("flower-outline.svg"),
		FLOWER_POPPY("flower-poppy.svg"),
		FLOWER_TULIP_OUTLINE("flower-tulip-outline.svg"),
		FLOWER_TULIP("flower-tulip.svg"),
		FLOWER("flower.svg"),
		FOLDER("folder.svg"),
		FONT_AWESOME("font-awesome.svg"),
		FOOD_APPLE_OUTLINE("food-apple-outline.svg"),
		FOOD_APPLE("food-apple.svg"),
		FOOD_CROISSANT("food-croissant.svg"),
		FOOD_FORK_DRINK("food-fork-drink.svg"),
		FOOD_OFF("food-off.svg"),
		FOOD_VARIANT("food-variant.svg"),
		FOOD("food.svg"),
		FOOTBALL_AUSTRALIAN("football-australian.svg"),
		FOOTBALL_HELMET("football-helmet.svg"),
		FOOTBALL("football.svg"),
		FOOTER("footer.svg"),
		FORKLIFT("forklift.svg"),
		FORUM_OUTLINE("forum-outline.svg"),
		FORUM("forum.svg"),
		FORWARD("forward.svg"),
		FORWARDBURGER("forwardburger.svg"),
		FOUNTAIN_PEN_TIP("fountain-pen-tip.svg"),
		FOUNTAIN_PEN("fountain-pen.svg"),
		FOUNTAIN("fountain.svg"),
		FOURSQUARE("foursquare.svg"),
		FREEBSD("freebsd.svg"),
		FRIDGE_FILLED_BOTTOM("fridge-filled-bottom.svg"),
		FRIDGE_FILLED_TOP("fridge-filled-top.svg"),
		FRIDGE_FILLED("fridge-filled.svg"),
		FRIDGE("fridge.svg"),
		FUEL("fuel.svg"),
		FULLSCREEN_EXIT("fullscreen-exit.svg"),
		FULLSCREEN("fullscreen.svg"),
		FUNCTION_VARIANT("function-variant.svg"),
		FUNCTION("function.svg"),
		FUSE_BLADE("fuse-blade.svg"),
		FUSE("fuse.svg"),
		GAMEPAD("gamepad.svg"),
		GANTRY_CRANE("gantry-crane.svg"),
		GARAGE_ALERT("garage-alert.svg"),
		GARAGE_OPEN("garage-open.svg"),
		GARAGE("garage.svg"),
		GAS_CYLINDER("gas-cylinder.svg"),
		GAS_STATION("gas-station.svg"),
		GATE_AND("gate-and.svg"),
		GATE_NAND("gate-nand.svg"),
		GATE_NOR("gate-nor.svg"),
		GATE_NOT("gate-not.svg"),
		GATE_OR("gate-or.svg"),
		GATE_XNOR("gate-xnor.svg"),
		GATE_XOR("gate-xor.svg"),
		GATE("gate.svg"),
		GATSBY("gatsby.svg"),
		GAUGE_EMPTY("gauge-empty.svg"),
		GAUGE_FULL("gauge-full.svg"),
		GAUGE_LOW("gauge-low.svg"),
		GAUGE("gauge.svg"),
		GAVEL("gavel.svg"),
		GENDER_FEMALE("gender-female.svg"),
		GENDER_MALE_FEMALE("gender-male-female.svg"),
		GENDER_MALE("gender-male.svg"),
		GENDER_TRANSGENDER("gender-transgender.svg"),
		GENTOO("gentoo.svg"),
		GESTURE("gesture.svg"),
		GHOST_OFF("ghost-off.svg"),
		GHOST("ghost.svg"),
		GIF("gif.svg"),
		GIFT_OUTLINE("gift-outline.svg"),
		GIFT("gift.svg"),
		GIT("git.svg"),
		GITHUB_BOX("github-box.svg"),
		GITHUB_CIRCLE("github-circle.svg"),
		GITHUB_FACE("github-face.svg"),
		GITLAB("gitlab.svg"),
		GLASS_FLUTE("glass-flute.svg"),
		GLASS_MUG("glass-mug.svg"),
		GLASS_STANGE("glass-stange.svg"),
		GLASS_TULIP("glass-tulip.svg"),
		GLASS_WINE("glass-wine.svg"),
		GLASSDOOR("glassdoor.svg"),
		GLASSES("glasses.svg"),
		GLOBE_MODEL("globe-model.svg"),
		GMAIL("gmail.svg"),
		GNOME("gnome.svg"),
		GO_KART_TRACK("go-kart-track.svg"),
		GO_KART("go-kart.svg"),
		GOG("gog.svg"),
		GOLF("golf.svg"),
		GONDOLA("gondola.svg"),
		GOODREADS("goodreads.svg"),
		GOOGLE("google.svg"),
		GPU("gpu.svg"),
		GRADIENT("gradient.svg"),
		GRAIN("grain.svg"),
		GRAPHQL("graphql.svg"),
		GRAVE_STONE("grave-stone.svg"),
		GREASE_PENCIL("grease-pencil.svg"),
		GREATER_THAN_OR_EQUAL("greater-than-or-equal.svg"),
		GREATER_THAN("greater-than.svg"),
		GRID_LARGE("grid-large.svg"),
		GRID_OFF("grid-off.svg"),
		GRID("grid.svg"),
		GRILL("grill.svg"),
		GROUP("group.svg"),
		GUITAR_ACOUSTIC("guitar-acoustic.svg"),
		GUITAR_ELECTRIC("guitar-electric.svg"),
		GUY_FAWKES_MASK("guy-fawkes-mask.svg"),
		HACKERNEWS("hackernews.svg"),
		HAIL("hail.svg"),
		HALLOWEEN("halloween.svg"),
		HAMBURGER("hamburger.svg"),
		HAMMER("hammer.svg"),
		HAND("hand.svg"),
		HANGER("hanger.svg"),
		HANGOUTS("hangouts.svg"),
		HARD_HAT("hard-hat.svg"),
		HARDDISK("harddisk.svg"),
		HAT_FEDORA("hat-fedora.svg"),
		HAZARD_LIGHTS("hazard-lights.svg"),
		HDR_OFF("hdr-off.svg"),
		HDR("hdr.svg"),
		HEADPHONES_BLUETOOTH("headphones-bluetooth.svg"),
		HEADPHONES_BOX("headphones-box.svg"),
		HEADPHONES_OFF("headphones-off.svg"),
		HEADPHONES_SETTINGS("headphones-settings.svg"),
		HEADPHONES("headphones.svg"),
		HEADSET_DOCK("headset-dock.svg"),
		HEADSET_OFF("headset-off.svg"),
		HEADSET("headset.svg"),
		HEART("heart.svg"),
		HELICOPTER("helicopter.svg"),
		HELP_BOX("help-box.svg"),
		HELP_CIRCLE_OUTLINE("help-circle-outline.svg"),
		HELP_CIRCLE("help-circle.svg"),
		HELP_NETWORK_OUTLINE("help-network-outline.svg"),
		HELP_NETWORK("help-network.svg"),
		HELP_RHOMBUS_OUTLINE("help-rhombus-outline.svg"),
		HELP_RHOMBUS("help-rhombus.svg"),
		HELP("help.svg"),
		HEXAGON_MULTIPLE("hexagon-multiple.svg"),
		HEXAGON_OUTLINE("hexagon-outline.svg"),
		HEXAGON_SLICE_1("hexagon-slice-1.svg"),
		HEXAGON_SLICE_2("hexagon-slice-2.svg"),
		HEXAGON_SLICE_3("hexagon-slice-3.svg"),
		HEXAGON_SLICE_4("hexagon-slice-4.svg"),
		HEXAGON_SLICE_5("hexagon-slice-5.svg"),
		HEXAGON_SLICE_6("hexagon-slice-6.svg"),
		HEXAGON("hexagon.svg"),
		HEXAGRAM_OUTLINE("hexagram-outline.svg"),
		HEXAGRAM("hexagram.svg"),
		HIGH_DEFINITION_BOX("high-definition-box.svg"),
		HIGH_DEFINITION("high-definition.svg"),
		HIGHWAY("highway.svg"),
		HIKING("hiking.svg"),
		HINDUISM("hinduism.svg"),
		HISTORY("history.svg"),
		HOCKEY_PUCK("hockey-puck.svg"),
		HOCKEY_STICKS("hockey-sticks.svg"),
		HOLOLENS("hololens.svg"),
		HOME("home.svg"),
		HOOK_OFF("hook-off.svg"),
		HOOK("hook.svg"),
		HOPS("hops.svg"),
		HORSESHOE("horseshoe.svg"),
		HOSPITAL_BUILDING("hospital-building.svg"),
		HOSPITAL_MARKER("hospital-marker.svg"),
		HOSPITAL("hospital.svg"),
		HOT_TUB("hot-tub.svg"),
		HOTEL("hotel.svg"),
		HOUZZ_BOX("houzz-box.svg"),
		HOUZZ("houzz.svg"),
		HUBSPOT("hubspot.svg"),
		HULU("hulu.svg"),
		HUMAN("human.svg"),
		HUMBLE_BUNDLE("humble-bundle.svg"),
		HURRICANE("hurricane.svg"),
		ICE_CREAM("ice-cream.svg"),
		IFRAME_OUTLINE("iframe-outline.svg"),
		IFRAME("iframe.svg"),
		IMAGE("image.svg"),
		IMPORT("import.svg"),
		INBOX_ARROW_DOWN("inbox-arrow-down.svg"),
		INBOX_ARROW_UP("inbox-arrow-up.svg"),
		INBOX_MULTIPLE_OUTLINE("inbox-multiple-outline.svg"),
		INBOX_MULTIPLE("inbox-multiple.svg"),
		INBOX("inbox.svg"),
		INCOGNITO("incognito.svg"),
		INDENT("indent.svg"),
		INFINITY("infinity.svg"),
		INFORMATION_OUTLINE("information-outline.svg"),
		INFORMATION_VARIANT("information-variant.svg"),
		INFORMATION("information.svg"),
		INSTAGRAM("instagram.svg"),
		INSTAPAPER("instapaper.svg"),
		INTERNET_EXPLORER("internet-explorer.svg"),
		INVERT_COLORS("invert-colors.svg"),
		IP_NETWORK_OUTLINE("ip-network-outline.svg"),
		IP_NETWORK("ip-network.svg"),
		IP("ip.svg"),
		IPOD("ipod.svg"),
		ISLAM("islam.svg"),
		ITUNES("itunes.svg"),
		JABBER("jabber.svg"),
		JEEPNEY("jeepney.svg"),
		JIRA("jira.svg"),
		JQUERY("jquery.svg"),
		JSFIDDLE("jsfiddle.svg"),
		JSON("json.svg"),
		JUDAISM("judaism.svg"),
		KABADDI("kabaddi.svg"),
		KARATE("karate.svg"),
		KEG("keg.svg"),
		KETTLE("kettle.svg"),
		KEY_CHANGE("key-change.svg"),
		KEY_MINUS("key-minus.svg"),
		KEY_OUTLINE("key-outline.svg"),
		KEY_PLUS("key-plus.svg"),
		KEY_REMOVE("key-remove.svg"),
		KEY_VARIANT("key-variant.svg"),
		KEY("key.svg"),
		KEYBOARD("keyboard.svg"),
		KICKSTARTER("kickstarter.svg"),
		KNIFE_MILITARY("knife-military.svg"),
		KNIFE("knife.svg"),
		KODI("kodi.svg"),
		LABEL_OFF_OUTLINE("label-off-outline.svg"),
		LABEL_OFF("label-off.svg"),
		LABEL_OUTLINE("label-outline.svg"),
		LABEL_VARIANT_OUTLINE("label-variant-outline.svg"),
		LABEL_VARIANT("label-variant.svg"),
		LABEL("label.svg"),
		LADYBUG("ladybug.svg"),
		LAMBDA("lambda.svg"),
		LAMP("lamp.svg"),
		LAN_CONNECT("lan-connect.svg"),
		LAN_DISCONNECT("lan-disconnect.svg"),
		LAN_PENDING("lan-pending.svg"),
		LAN("lan.svg"),
		LAPTOP_CHROMEBOOK("laptop-chromebook.svg"),
		LAPTOP_MAC("laptop-mac.svg"),
		LAPTOP_OFF("laptop-off.svg"),
		LAPTOP_WINDOWS("laptop-windows.svg"),
		LAPTOP("laptop.svg"),
		LARAVEL("laravel.svg"),
		LASTFM("lastfm.svg"),
		LASTPASS("lastpass.svg"),
		LAUNCH("launch.svg"),
		LAVA_LAMP("lava-lamp.svg"),
		LAYERS_MINUS("layers-minus.svg"),
		LAYERS_OFF_OUTLINE("layers-off-outline.svg"),
		LAYERS_OFF("layers-off.svg"),
		LAYERS_OUTLINE("layers-outline.svg"),
		LAYERS_PLUS("layers-plus.svg"),
		LAYERS_REMOVE("layers-remove.svg"),
		LAYERS("layers.svg"),
		LEAD_PENCIL("lead-pencil.svg"),
		LEAF_MAPLE("leaf-maple.svg"),
		LEAF("leaf.svg"),
		LEAK_OFF("leak-off.svg"),
		LEAK("leak.svg"),
		LED_OFF("led-off.svg"),
		LED_ON("led-on.svg"),
		LED_OUTLINE("led-outline.svg"),
		LED_STRIP("led-strip.svg"),
		LED_VARIANT_OFF("led-variant-off.svg"),
		LED_VARIANT_ON("led-variant-on.svg"),
		LED_VARIANT_OUTLINE("led-variant-outline.svg"),
		LESS_THAN_OR_EQUAL("less-than-or-equal.svg"),
		LESS_THAN("less-than.svg"),
		LIBRARY_BOOKS("library-books.svg"),
		LIBRARY_MOVIE("library-movie.svg"),
		LIBRARY_MUSIC("library-music.svg"),
		LIBRARY_PLUS("library-plus.svg"),
		LIBRARY_SHELVES("library-shelves.svg"),
		LIBRARY_VIDEO("library-video.svg"),
		LIBRARY("library.svg"),
		LIFEBUOY("lifebuoy.svg"),
		LIGHT_SWITCH("light-switch.svg"),
		LIGHTBULB_ON_OUTLINE("lightbulb-on-outline.svg"),
		LIGHTBULB_ON("lightbulb-on.svg"),
		LIGHTBULB_OUTLINE("lightbulb-outline.svg"),
		LIGHTBULB("lightbulb.svg"),
		LIGHTHOUSE_ON("lighthouse-on.svg"),
		LIGHTHOUSE("lighthouse.svg"),
		LINK_BOX_OUTLINE("link-box-outline.svg"),
		LINK_BOX_VARIANT_OUTLINE("link-box-variant-outline.svg"),
		LINK_BOX_VARIANT("link-box-variant.svg"),
		LINK_BOX("link-box.svg"),
		LINK_OFF("link-off.svg"),
		LINK_PLUS("link-plus.svg"),
		LINK_VARIANT_OFF("link-variant-off.svg"),
		LINK_VARIANT("link-variant.svg"),
		LINK("link.svg"),
		LINKEDIN_BOX("linkedin-box.svg"),
		LINKEDIN("linkedin.svg"),
		LINODE("linode.svg"),
		LINUX_MINT("linux-mint.svg"),
		LINUX("linux.svg"),
		LITECOIN("litecoin.svg"),
		LOADING("loading.svg"),
		LOCK("lock.svg"),
		LOCKER_MULTIPLE("locker-multiple.svg"),
		LOCKER("locker.svg"),
		LOGIN_VARIANT("login-variant.svg"),
		LOGIN("login.svg"),
		LOGOUT_VARIANT("logout-variant.svg"),
		LOGOUT("logout.svg"),
		LOOKS("looks.svg"),
		LOOP("loop.svg"),
		LOUPE("loupe.svg"),
		LUMX("lumx.svg"),
		LYFT("lyft.svg"),
		MAGNET_ON("magnet-on.svg"),
		MAGNET("magnet.svg"),
		MAGNIFY_CLOSE("magnify-close.svg"),
		MAGNIFY_MINUS_CURSOR("magnify-minus-cursor.svg"),
		MAGNIFY_MINUS_OUTLINE("magnify-minus-outline.svg"),
		MAGNIFY_MINUS("magnify-minus.svg"),
		MAGNIFY_PLUS_CURSOR("magnify-plus-cursor.svg"),
		MAGNIFY_PLUS_OUTLINE("magnify-plus-outline.svg"),
		MAGNIFY_PLUS("magnify-plus.svg"),
		MAGNIFY("magnify.svg"),
		MAIL_RU("mail-ru.svg"),
		MAILBOX_OPEN_OUTLINE("mailbox-open-outline.svg"),
		MAILBOX_OPEN_UP_OUTLINE("mailbox-open-up-outline.svg"),
		MAILBOX_OPEN_UP("mailbox-open-up.svg"),
		MAILBOX_OPEN("mailbox-open.svg"),
		MAILBOX_OUTLINE("mailbox-outline.svg"),
		MAILBOX_UP_OUTLINE("mailbox-up-outline.svg"),
		MAILBOX_UP("mailbox-up.svg"),
		MAILBOX("mailbox.svg"),
		MAP("map.svg"),
		MAPBOX("mapbox.svg"),
		MARGIN("margin.svg"),
		MARKDOWN("markdown.svg"),
		MARKER_CANCEL("marker-cancel.svg"),
		MARKER_CHECK("marker-check.svg"),
		MARKER("marker.svg"),
		MARTINI("martini.svg"),
		MASTODON_VARIANT("mastodon-variant.svg"),
		MASTODON("mastodon.svg"),
		MATERIAL_DESIGN("material-design.svg"),
		MATERIAL_UI("material-ui.svg"),
		MATH_COS("math-cos.svg"),
		MATH_SIN("math-sin.svg"),
		MATH_TAN("math-tan.svg"),
		MATRIX("matrix.svg"),
		MAXCDN("maxcdn.svg"),
		MEDAL("medal.svg"),
		MEDICAL_BAG("medical-bag.svg"),
		MEDIUM("medium.svg"),
		MEETUP("meetup.svg"),
		MEMORY("memory.svg"),
		MENU("menu.svg"),
		MESSAGE("message.svg"),
		METEOR("meteor.svg"),
		METRONOME_TICK("metronome-tick.svg"),
		METRONOME("metronome.svg"),
		MICRO_SD("micro-sd.svg"),
		MICROPHONE_MINUS("microphone-minus.svg"),
		MICROPHONE_OFF("microphone-off.svg"),
		MICROPHONE_OUTLINE("microphone-outline.svg"),
		MICROPHONE_PLUS("microphone-plus.svg"),
		MICROPHONE_SETTINGS("microphone-settings.svg"),
		MICROPHONE_VARIANT_OFF("microphone-variant-off.svg"),
		MICROPHONE_VARIANT("microphone-variant.svg"),
		MICROPHONE("microphone.svg"),
		MICROSCOPE("microscope.svg"),
		MICROSOFT_DYNAMICS("microsoft-dynamics.svg"),
		MICROSOFT("microsoft.svg"),
		MICROWAVE("microwave.svg"),
		MIDI_INPUT("midi-input.svg"),
		MIDI("midi.svg"),
		MINE("mine.svg"),
		MINECRAFT("minecraft.svg"),
		MINI_SD("mini-sd.svg"),
		MINIDISC("minidisc.svg"),
		MINUS_BOX_OUTLINE("minus-box-outline.svg"),
		MINUS_BOX("minus-box.svg"),
		MINUS_CIRCLE_OUTLINE("minus-circle-outline.svg"),
		MINUS_CIRCLE("minus-circle.svg"),
		MINUS_NETWORK_OUTLINE("minus-network-outline.svg"),
		MINUS_NETWORK("minus-network.svg"),
		MINUS("minus.svg"),
		MIXCLOUD("mixcloud.svg"),
		MIXED_MARTIAL_ARTS("mixed-martial-arts.svg"),
		MIXED_REALITY("mixed-reality.svg"),
		MIXER("mixer.svg"),
		MOLECULE("molecule.svg"),
		MONITOR_CELLPHONE_STAR("monitor-cellphone-star.svg"),
		MONITOR_CELLPHONE("monitor-cellphone.svg"),
		MONITOR_DASHBOARD("monitor-dashboard.svg"),
		MONITOR_LOCK("monitor-lock.svg"),
		MONITOR_MULTIPLE("monitor-multiple.svg"),
		MONITOR_OFF("monitor-off.svg"),
		MONITOR_STAR("monitor-star.svg"),
		MONITOR("monitor.svg"),
		MORE("more.svg"),
		MOTHER_NURSE("mother-nurse.svg"),
		MOTION_SENSOR("motion-sensor.svg"),
		MOTORBIKE("motorbike.svg"),
		MOUSE_BLUETOOTH("mouse-bluetooth.svg"),
		MOUSE_OFF("mouse-off.svg"),
		MOUSE_VARIANT_OFF("mouse-variant-off.svg"),
		MOUSE_VARIANT("mouse-variant.svg"),
		MOUSE("mouse.svg"),
		MOVE_RESIZE_VARIANT("move-resize-variant.svg"),
		MOVE_RESIZE("move-resize.svg"),
		MOVIE_OUTLINE("movie-outline.svg"),
		MOVIE_ROLL("movie-roll.svg"),
		MOVIE("movie.svg"),
		MUFFIN("muffin.svg"),
		MULTIPLICATION_BOX("multiplication-box.svg"),
		MULTIPLICATION("multiplication.svg"),
		MUSHROOM_OUTLINE("mushroom-outline.svg"),
		MUSHROOM("mushroom.svg"),
		MUSIC("music.svg"),
		NAIL("nail.svg"),
		NAS("nas.svg"),
		NATIVESCRIPT("nativescript.svg"),
		NATURE_PEOPLE("nature-people.svg"),
		NATURE("nature.svg"),
		NAVIGATION("navigation.svg"),
		NEAR_ME("near-me.svg"),
		NEEDLE("needle.svg"),
		NEST_PROTECT("nest-protect.svg"),
		NEST_THERMOSTAT("nest-thermostat.svg"),
		NETFLIX("netflix.svg"),
		NETWORK("network.svg"),
		NEW_BOX("new-box.svg"),
		NEWSPAPER("newspaper.svg"),
		NFC_SEARCH_VARIANT("nfc-search-variant.svg"),
		NFC_TAP("nfc-tap.svg"),
		NFC_VARIANT("nfc-variant.svg"),
		NFC("nfc.svg"),
		NINJA("ninja.svg"),
		NINTENDO_SWITCH("nintendo-switch.svg"),
		NO("no.svg"),
		NODEJS("nodejs.svg"),
		NOT_EQUAL_VARIANT("not-equal-variant.svg"),
		NOT_EQUAL("not-equal.svg"),
		NOTE_MULTIPLE_OUTLINE("note-multiple-outline.svg"),
		NOTE_MULTIPLE("note-multiple.svg"),
		NOTE_OUTLINE("note-outline.svg"),
		NOTE_PLUS_OUTLINE("note-plus-outline.svg"),
		NOTE_PLUS("note-plus.svg"),
		NOTE_TEXT("note-text.svg"),
		NOTE("note.svg"),
		NOTEBOOK_MULTIPLE("notebook-multiple.svg"),
		NOTEBOOK("notebook.svg"),
		NOTIFICATION_CLEAR_ALL("notification-clear-all.svg"),
		NPM_VARIANT_OUTLINE("npm-variant-outline.svg"),
		NPM_VARIANT("npm-variant.svg"),
		NPM("npm.svg"),
		NUKE("nuke.svg"),
		NULL("null.svg"),
		NUMERIC("numeric.svg"),
		NUT("nut.svg"),
		NUTRITION("nutrition.svg"),
		OAR("oar.svg"),
		OCARINA("ocarina.svg"),
		OCTAGON_OUTLINE("octagon-outline.svg"),
		OCTAGON("octagon.svg"),
		OCTAGRAM_OUTLINE("octagram-outline.svg"),
		OCTAGRAM("octagram.svg"),
		ODNOKLASSNIKI("odnoklassniki.svg"),
		OFFICE_BUILDING("office-building.svg"),
		OFFICE("office.svg"),
		OIL_TEMPERATURE("oil-temperature.svg"),
		OIL("oil.svg"),
		OMEGA("omega.svg"),
		ONE_UP("one-up.svg"),
		ONEDRIVE("onedrive.svg"),
		ONENOTE("onenote.svg"),
		ONEPASSWORD("onepassword.svg"),
		OPACITY("opacity.svg"),
		OPEN_IN_APP("open-in-app.svg"),
		OPEN_IN_NEW("open-in-new.svg"),
		OPEN_SOURCE_INITIATIVE("open-source-initiative.svg"),
		OPENID("openid.svg"),
		OPERA("opera.svg"),
		ORBIT("orbit.svg"),
		ORIGIN("origin.svg"),
		ORNAMENT_VARIANT("ornament-variant.svg"),
		ORNAMENT("ornament.svg"),
		OUTBOX("outbox.svg"),
		OUTDENT("outdent.svg"),
		OUTLOOK("outlook.svg"),
		OWL("owl.svg"),
		PAC_MAN("pac-man.svg"),
		PACKAGE_DOWN("package-down.svg"),
		PACKAGE_UP("package-up.svg"),
		PACKAGE_VARIANT_CLOSED("package-variant-closed.svg"),
		PACKAGE_VARIANT("package-variant.svg"),
		PACKAGE("package.svg"),
		PALETTE_ADVANCED("palette-advanced.svg"),
		PALETTE_OUTLINE("palette-outline.svg"),
		PALETTE_SWATCH("palette-swatch.svg"),
		PALETTE("palette.svg"),
		PAN("pan.svg"),
		PANDA("panda.svg"),
		PANDORA("pandora.svg"),
		PANORAMA_FISHEYE("panorama-fisheye.svg"),
		PANORAMA_HORIZONTAL("panorama-horizontal.svg"),
		PANORAMA_VERTICAL("panorama-vertical.svg"),
		PANORAMA_WIDE_ANGLE("panorama-wide-angle.svg"),
		PANORAMA("panorama.svg"),
		PAPER_CUT_VERTICAL("paper-cut-vertical.svg"),
		PAPERCLIP("paperclip.svg"),
		PARACHUTE_OUTLINE("parachute-outline.svg"),
		PARACHUTE("parachute.svg"),
		PARKING("parking.svg"),
		PASSPORT_BIOMETRIC("passport-biometric.svg"),
		PASSPORT("passport.svg"),
		PATREON("patreon.svg"),
		PAUSE_CIRCLE_OUTLINE("pause-circle-outline.svg"),
		PAUSE_CIRCLE("pause-circle.svg"),
		PAUSE_OCTAGON_OUTLINE("pause-octagon-outline.svg"),
		PAUSE_OCTAGON("pause-octagon.svg"),
		PAUSE("pause.svg"),
		PAW_OFF("paw-off.svg"),
		PAW("paw.svg"),
		PAYPAL("paypal.svg"),
		PDF_BOX("pdf-box.svg"),
		PEACE("peace.svg"),
		PEN_LOCK("pen-lock.svg"),
		PEN_MINUS("pen-minus.svg"),
		PEN_OFF("pen-off.svg"),
		PEN_PLUS("pen-plus.svg"),
		PEN_REMOVE("pen-remove.svg"),
		PEN("pen.svg"),
		PENCIL("pencil.svg"),
		PENTAGON_OUTLINE("pentagon-outline.svg"),
		PENTAGON("pentagon.svg"),
		PEOPLE("people.svg"),
		PERCENT("percent.svg"),
		PERIODIC_TABLE_CO2("periodic-table-co2.svg"),
		PERIODIC_TABLE("periodic-table.svg"),
		PERISCOPE("periscope.svg"),
		PERSON_BOX("person-box.svg"),
		PERSON_MINUS("person-minus.svg"),
		PERSON_PLUS("person-plus.svg"),
		PERSPECTIVE_LESS("perspective-less.svg"),
		PERSPECTIVE_MORE("perspective-more.svg"),
		PHARMACY("pharmacy.svg"),
		PHONE("phone.svg"),
		PI_BOX("pi-box.svg"),
		PI_HOLE("pi-hole.svg"),
		PI("pi.svg"),
		PIANO("piano.svg"),
		PICKAXE("pickaxe.svg"),
		PICTURE_IN_PICTURE_BOTTOM_RIGHT_OUTLINE("picture-in-picture-bottom-right-outline.svg"),
		PICTURE_IN_PICTURE_BOTTOM_RIGHT("picture-in-picture-bottom-right.svg"),
		PICTURE_IN_PICTURE_TOP_RIGHT_OUTLINE("picture-in-picture-top-right-outline.svg"),
		PICTURE_IN_PICTURE_TOP_RIGHT("picture-in-picture-top-right.svg"),
		PICTURE("picture.svg"),
		PIER_CRANE("pier-crane.svg"),
		PIER("pier.svg"),
		PIG("pig.svg"),
		PILL("pill.svg"),
		PILLAR("pillar.svg"),
		PIN_OFF_OUTLINE("pin-off-outline.svg"),
		PIN_OFF("pin-off.svg"),
		PIN_OUTLINE("pin-outline.svg"),
		PIN("pin.svg"),
		PINE_TREE_BOX("pine-tree-box.svg"),
		PINE_TREE("pine-tree.svg"),
		PINTEREST_BOX("pinterest-box.svg"),
		PINTEREST("pinterest.svg"),
		PINWHEEL_OUTLINE("pinwheel-outline.svg"),
		PINWHEEL("pinwheel.svg"),
		PIPE_DISCONNECTED("pipe-disconnected.svg"),
		PIPE_LEAK("pipe-leak.svg"),
		PIPE("pipe.svg"),
		PIRATE("pirate.svg"),
		PISTOL("pistol.svg"),
		PISTON("piston.svg"),
		PIZZA("pizza.svg"),
		PLANE("plane.svg"),
		PLAY_BOX_OUTLINE("play-box-outline.svg"),
		PLAY_CIRCLE_OUTLINE("play-circle-outline.svg"),
		PLAY_CIRCLE("play-circle.svg"),
		PLAY_NETWORK_OUTLINE("play-network-outline.svg"),
		PLAY_NETWORK("play-network.svg"),
		PLAY_PAUSE("play-pause.svg"),
		PLAY_PROTECTED_CONTENT("play-protected-content.svg"),
		PLAY_SPEED("play-speed.svg"),
		PLAY("play.svg"),
		PLAYLIST_CHECK("playlist-check.svg"),
		PLAYLIST_EDIT("playlist-edit.svg"),
		PLAYLIST_MINUS("playlist-minus.svg"),
		PLAYLIST_MUSIC_OUTLINE("playlist-music-outline.svg"),
		PLAYLIST_MUSIC("playlist-music.svg"),
		PLAYLIST_PLAY("playlist-play.svg"),
		PLAYLIST_PLUS("playlist-plus.svg"),
		PLAYLIST_REMOVE("playlist-remove.svg"),
		PLAYLIST_STAR("playlist-star.svg"),
		PLAYSTATION("playstation.svg"),
		PLEX("plex.svg"),
		PLUS("plus.svg"),
		POCKET("pocket.svg"),
		PODCAST("podcast.svg"),
		PODIUM_BRONZE("podium-bronze.svg"),
		PODIUM_GOLD("podium-gold.svg"),
		PODIUM_SILVER("podium-silver.svg"),
		PODIUM("podium.svg"),
		POINT_OF_SALE("point-of-sale.svg"),
		POKEBALL("pokeball.svg"),
		POKEMON_GO("pokemon-go.svg"),
		POKER_CHIP("poker-chip.svg"),
		POLAROID("polaroid.svg"),
		POLL_BOX("poll-box.svg"),
		POLL("poll.svg"),
		POLYMER("polymer.svg"),
		POOL("pool.svg"),
		POPCORN("popcorn.svg"),
		POSTAGE_STAMP("postage-stamp.svg"),
		POT_MIX("pot-mix.svg"),
		POT("pot.svg"),
		POUND_BOX("pound-box.svg"),
		POUND("pound.svg"),
		POWER("power.svg"),
		POWERSHELL("powershell.svg"),
		PRESCRIPTION("prescription.svg"),
		PRESENTATION_PLAY("presentation-play.svg"),
		PRESENTATION("presentation.svg"),
		PRINTER_3D("printer-3d.svg"),
		PRINTER_ALERT("printer-alert.svg"),
		PRINTER_OFF("printer-off.svg"),
		PRINTER_SETTINGS("printer-settings.svg"),
		PRINTER_WIRELESS("printer-wireless.svg"),
		PRINTER("printer.svg"),
		PRIORITY_HIGH("priority-high.svg"),
		PRIORITY_LOW("priority-low.svg"),
		PROFESSIONAL_HEXAGON("professional-hexagon.svg"),
		PROGRESS_ALERT("progress-alert.svg"),
		PROGRESS_CHECK("progress-check.svg"),
		PROGRESS_CLOCK("progress-clock.svg"),
		PROGRESS_DOWNLOAD("progress-download.svg"),
		PROGRESS_UPLOAD("progress-upload.svg"),
		PROGRESS_WRENCH("progress-wrench.svg"),
		PROJECTOR_SCREEN("projector-screen.svg"),
		PROJECTOR("projector.svg"),
		PUBLISH("publish.svg"),
		PULSE("pulse.svg"),
		PUMPKIN("pumpkin.svg"),
		PUZZLE_OUTLINE("puzzle-outline.svg"),
		PUZZLE("puzzle.svg"),
		QI("qi.svg"),
		QQCHAT("qqchat.svg"),
		QRCODE_EDIT("qrcode-edit.svg"),
		QRCODE_SCAN("qrcode-scan.svg"),
		QRCODE("qrcode.svg"),
		QUADCOPTER("quadcopter.svg"),
		QUALITY_HIGH("quality-high.svg"),
		QUALITY_LOW("quality-low.svg"),
		QUALITY_MEDIUM("quality-medium.svg"),
		QUESTION_MARK_CIRCLE("question-mark-circle.svg"),
		QUICK_REPLY("quick-reply.svg"),
		QUICKTIME("quicktime.svg"),
		QUORA("quora.svg"),
		RABBIT("rabbit.svg"),
		RACING_HELMET("racing-helmet.svg"),
		RACQUETBALL("racquetball.svg"),
		RADAR("radar.svg"),
		RADIATOR_DISABLED("radiator-disabled.svg"),
		RADIATOR_OFF("radiator-off.svg"),
		RADIATOR("radiator.svg"),
		RADIO_AM("radio-am.svg"),
		RADIO_FM("radio-fm.svg"),
		RADIO_HANDHELD("radio-handheld.svg"),
		RADIO_TOWER("radio-tower.svg"),
		RADIO("radio.svg"),
		RADIOACTIVE("radioactive.svg"),
		RADIOBOX_BLANK("radiobox-blank.svg"),
		RADIOBOX_MARKED("radiobox-marked.svg"),
		RADIUS_OUTLINE("radius-outline.svg"),
		RADIUS("radius.svg"),
		RASPBERRYPI("raspberrypi.svg"),
		RAY_END_ARROW("ray-end-arrow.svg"),
		RAY_END("ray-end.svg"),
		RAY_START_ARROW("ray-start-arrow.svg"),
		RAY_START_END("ray-start-end.svg"),
		RAY_START("ray-start.svg"),
		RAY_VERTEX("ray-vertex.svg"),
		RDIO("rdio.svg"),
		REACT("react.svg"),
		READ("read.svg"),
		RECEIPT("receipt.svg"),
		RECORD_PLAYER("record-player.svg"),
		RECORD_REC("record-rec.svg"),
		RECORD("record.svg"),
		RECTANGLE_OUTLINE("rectangle-outline.svg"),
		RECTANGLE("rectangle.svg"),
		RECYCLE("recycle.svg"),
		REDDIT("reddit.svg"),
		REDO_VARIANT("redo-variant.svg"),
		REDO("redo.svg"),
		REFLECT_HORIZONTAL("reflect-horizontal.svg"),
		REFLECT_VERTICAL("reflect-vertical.svg"),
		REFRESH("refresh.svg"),
		REGISTERED_TRADEMARK("registered-trademark.svg"),
		RELATIVE_SCALE("relative-scale.svg"),
		RELOAD("reload.svg"),
		REMINDER("reminder.svg"),
		REMOTE_DESKTOP("remote-desktop.svg"),
		REMOTE("remote.svg"),
		RENAME_BOX("rename-box.svg"),
		REORDER_HORIZONTAL("reorder-horizontal.svg"),
		REORDER_VERTICAL("reorder-vertical.svg"),
		REPEAT_OFF("repeat-off.svg"),
		REPEAT_ONCE("repeat-once.svg"),
		REPEAT("repeat.svg"),
		REPLAY("replay.svg"),
		REPLY_ALL("reply-all.svg"),
		REPLY("reply.svg"),
		REPRODUCTION("reproduction.svg"),
		RESISTOR_NODES("resistor-nodes.svg"),
		RESISTOR("resistor.svg"),
		RESIZE_BOTTOM_RIGHT("resize-bottom-right.svg"),
		RESIZE("resize.svg"),
		RESPONSIVE("responsive.svg"),
		RESTART_OFF("restart-off.svg"),
		RESTART("restart.svg"),
		RESTORE_CLOCK("restore-clock.svg"),
		RESTORE("restore.svg"),
		REWIND_10("rewind-10.svg"),
		REWIND_30("rewind-30.svg"),
		REWIND_OUTLINE("rewind-outline.svg"),
		REWIND("rewind.svg"),
		RHOMBUS_MEDIUM("rhombus-medium.svg"),
		RHOMBUS_OUTLINE("rhombus-outline.svg"),
		RHOMBUS_SPLIT("rhombus-split.svg"),
		RHOMBUS("rhombus.svg"),
		RIBBON("ribbon.svg"),
		RICE("rice.svg"),
		RING("ring.svg"),
		RIVET("rivet.svg"),
		ROAD_VARIANT("road-variant.svg"),
		ROAD("road.svg"),
		ROBOT_INDUSTRIAL("robot-industrial.svg"),
		ROBOT_VACUUM_VARIANT("robot-vacuum-variant.svg"),
		ROBOT_VACUUM("robot-vacuum.svg"),
		ROBOT("robot.svg"),
		ROCKET("rocket.svg"),
		ROLLER_SKATE("roller-skate.svg"),
		ROLLERBLADE("rollerblade.svg"),
		ROLLUPJS("rollupjs.svg"),
		ROOM_SERVICE_OUTLINE("room-service-outline.svg"),
		ROOM_SERVICE("room-service.svg"),
		ROTATE_3D("rotate-3d.svg"),
		ROTATE_LEFT_VARIANT("rotate-left-variant.svg"),
		ROTATE_LEFT("rotate-left.svg"),
		ROTATE_ORBIT("rotate-orbit.svg"),
		ROTATE_RIGHT_VARIANT("rotate-right-variant.svg"),
		ROTATE_RIGHT("rotate-right.svg"),
		ROUNDED_CORNER("rounded-corner.svg"),
		ROUTER_WIRELESS_SETTINGS("router-wireless-settings.svg"),
		ROUTER_WIRELESS("router-wireless.svg"),
		ROUTES("routes.svg"),
		ROWING("rowing.svg"),
		RSS_BOX("rss-box.svg"),
		RSS("rss.svg"),
		RUBY("ruby.svg"),
		RUGBY("rugby.svg"),
		RULER_SQUARE("ruler-square.svg"),
		RULER("ruler.svg"),
		RUN_FAST("run-fast.svg"),
		RUN("run.svg"),
		SACK_PERCENT("sack-percent.svg"),
		SACK("sack.svg"),
		SAFE("safe.svg"),
		SAFETY_GOOGLES("safety-googles.svg"),
		SALE("sale.svg"),
		SALESFORCE("salesforce.svg"),
		SASS("sass.svg"),
		SATELLITE_UPLINK("satellite-uplink.svg"),
		SATELLITE_VARIANT("satellite-variant.svg"),
		SATELLITE("satellite.svg"),
		SAUSAGE("sausage.svg"),
		SAW_BLADE("saw-blade.svg"),
		SAXOPHONE("saxophone.svg"),
		SCALE_BALANCE("scale-balance.svg"),
		SCALE_BATHROOM("scale-bathroom.svg"),
		SCALE("scale.svg"),
		SCANNER_OFF("scanner-off.svg"),
		SCANNER("scanner.svg"),
		SCHOOL("school.svg"),
		SCISSORS_CUTTING("scissors-cutting.svg"),
		SCREEN_ROTATION_LOCK("screen-rotation-lock.svg"),
		SCREEN_ROTATION("screen-rotation.svg"),
		SCREW_FLAT_TOP("screw-flat-top.svg"),
		SCREW_LAG("screw-lag.svg"),
		SCREW_MACHINE_FLAT_TOP("screw-machine-flat-top.svg"),
		SCREW_MACHINE_ROUND_TOP("screw-machine-round-top.svg"),
		SCREW_ROUND_TOP("screw-round-top.svg"),
		SCREWDRIVER("screwdriver.svg"),
		SCRIPT_OUTLINE("script-outline.svg"),
		SCRIPT_TEXT_OUTLINE("script-text-outline.svg"),
		SCRIPT_TEXT("script-text.svg"),
		SCRIPT("script.svg"),
		SD("sd.svg"),
		SEAL("seal.svg"),
		SEARCH_WEB("search-web.svg"),
		SEAT_FLAT_ANGLED("seat-flat-angled.svg"),
		SEAT_FLAT("seat-flat.svg"),
		SEAT_INDIVIDUAL_SUITE("seat-individual-suite.svg"),
		SEAT_LEGROOM_EXTRA("seat-legroom-extra.svg"),
		SEAT_LEGROOM_NORMAL("seat-legroom-normal.svg"),
		SEAT_LEGROOM_REDUCED("seat-legroom-reduced.svg"),
		SEAT_OUTLINE("seat-outline.svg"),
		SEAT_RECLINE_EXTRA("seat-recline-extra.svg"),
		SEAT_RECLINE_NORMAL("seat-recline-normal.svg"),
		SEAT("seat.svg"),
		SEATBELT("seatbelt.svg"),
		SECURITY_CLOSE("security-close.svg"),
		SECURITY_NETWORK("security-network.svg"),
		SECURITY("security.svg"),
		SEED_OUTLINE("seed-outline.svg"),
		SEED("seed.svg"),
		SELECT_ALL("select-all.svg"),
		SELECT_COLOR("select-color.svg"),
		SELECT_COMPARE("select-compare.svg"),
		SELECT_DRAG("select-drag.svg"),
		SELECT_INVERSE("select-inverse.svg"),
		SELECT_OFF("select-off.svg"),
		SELECT("select.svg"),
		SELECTION_DRAG("selection-drag.svg"),
		SELECTION_ELLIPSE("selection-ellipse.svg"),
		SELECTION_LASSO("selection-lasso.svg"),
		SELECTION_OFF("selection-off.svg"),
		SELECTION("selection.svg"),
		SEND_CIRCLE_OUTLINE("send-circle-outline.svg"),
		SEND_CIRCLE("send-circle.svg"),
		SEND_LOCK("send-lock.svg"),
		SEND("send.svg"),
		SERIAL_PORT("serial-port.svg"),
		SERVER_MINUS("server-minus.svg"),
		SERVER_NETWORK_OFF("server-network-off.svg"),
		SERVER_NETWORK("server-network.svg"),
		SERVER_OFF("server-off.svg"),
		SERVER_PLUS("server-plus.svg"),
		SERVER_REMOVE("server-remove.svg"),
		SERVER_SECURITY("server-security.svg"),
		SERVER("server.svg"),
		SET_ALL("set-all.svg"),
		SET_CENTER_RIGHT("set-center-right.svg"),
		SET_CENTER("set-center.svg"),
		SET_LEFT_CENTER("set-left-center.svg"),
		SET_LEFT_RIGHT("set-left-right.svg"),
		SET_LEFT("set-left.svg"),
		SET_NONE("set-none.svg"),
		SET_RIGHT("set-right.svg"),
		SET_TOP_BOX("set-top-box.svg"),
		SETTINGS_BOX("settings-box.svg"),
		SETTINGS_HELPER("settings-helper.svg"),
		SETTINGS_OUTLINE("settings-outline.svg"),
		SETTINGS("settings.svg"),
		SHAPE_CIRCLE_PLUS("shape-circle-plus.svg"),
		SHAPE_OUTLINE("shape-outline.svg"),
		SHAPE_PLUS("shape-plus.svg"),
		SHAPE_POLYGON_PLUS("shape-polygon-plus.svg"),
		SHAPE_RECTANGLE_PLUS("shape-rectangle-plus.svg"),
		SHAPE_SQUARE_PLUS("shape-square-plus.svg"),
		SHAPE("shape.svg"),
		SHARE_OUTLINE("share-outline.svg"),
		SHARE_VARIANT("share-variant.svg"),
		SHARE("share.svg"),
		SHEEP("sheep.svg"),
		SHIELD("shield.svg"),
		SHIP_WHEEL("ship-wheel.svg"),
		SHOE_FORMAL("shoe-formal.svg"),
		SHOE_HEEL("shoe-heel.svg"),
		SHOE_PRINT("shoe-print.svg"),
		SHOPIFY("shopify.svg"),
		SHOPPING_MUSIC("shopping-music.svg"),
		SHOPPING("shopping.svg"),
		SHOVEL_OFF("shovel-off.svg"),
		SHOVEL("shovel.svg"),
		SHOWER_HEAD("shower-head.svg"),
		SHOWER("shower.svg"),
		SHREDDER("shredder.svg"),
		SHUFFLE_DISABLED("shuffle-disabled.svg"),
		SHUFFLE_VARIANT("shuffle-variant.svg"),
		SHUFFLE("shuffle.svg"),
		SIGMA_LOWER("sigma-lower.svg"),
		SIGMA("sigma.svg"),
		SIGN_CAUTION("sign-caution.svg"),
		SIGN_DIRECTION("sign-direction.svg"),
		SIGN_TEXT("sign-text.svg"),
		SIGNAL("signal.svg"),
		SIGNATURE_FREEHAND("signature-freehand.svg"),
		SIGNATURE_IMAGE("signature-image.svg"),
		SIGNATURE_TEXT("signature-text.svg"),
		SIGNATURE("signature.svg"),
		SILO("silo.svg"),
		SILVERWARE_FORK_KNIFE("silverware-fork-knife.svg"),
		SILVERWARE_FORK("silverware-fork.svg"),
		SILVERWARE_SPOON("silverware-spoon.svg"),
		SILVERWARE_VARIANT("silverware-variant.svg"),
		SILVERWARE("silverware.svg"),
		SIM_ALERT("sim-alert.svg"),
		SIM_OFF("sim-off.svg"),
		SIM("sim.svg"),
		SINA_WEIBO("sina-weibo.svg"),
		SITEMAP("sitemap.svg"),
		SKATE("skate.svg"),
		SKEW_LESS("skew-less.svg"),
		SKEW_MORE("skew-more.svg"),
		SKIP_BACKWARD("skip-backward.svg"),
		SKIP_FORWARD("skip-forward.svg"),
		SKIP_NEXT_CIRCLE_OUTLINE("skip-next-circle-outline.svg"),
		SKIP_NEXT_CIRCLE("skip-next-circle.svg"),
		SKIP_NEXT("skip-next.svg"),
		SKIP_PREVIOUS_CIRCLE_OUTLINE("skip-previous-circle-outline.svg"),
		SKIP_PREVIOUS_CIRCLE("skip-previous-circle.svg"),
		SKIP_PREVIOUS("skip-previous.svg"),
		SKULL_CROSSBONES_OUTLINE("skull-crossbones-outline.svg"),
		SKULL_CROSSBONES("skull-crossbones.svg"),
		SKULL_OUTLINE("skull-outline.svg"),
		SKULL("skull.svg"),
		SKYPE_BUSINESS("skype-business.svg"),
		SKYPE("skype.svg"),
		SLACK("slack.svg"),
		SLACKWARE("slackware.svg"),
		SLEEP_OFF("sleep-off.svg"),
		SLEEP("sleep.svg"),
		SLOPE_DOWNHILL("slope-downhill.svg"),
		SLOPE_UPHILL("slope-uphill.svg"),
		SMOG("smog.svg"),
		SMOKING_OFF("smoking-off.svg"),
		SMOKING("smoking.svg"),
		SNAPCHAT("snapchat.svg"),
		SNOWFLAKE("snowflake.svg"),
		SNOWMAN("snowman.svg"),
		SOCCER_FIELD("soccer-field.svg"),
		SOCCER("soccer.svg"),
		SOFA("sofa.svg"),
		SOLAR_PANEL_LARGE("solar-panel-large.svg"),
		SOLAR_PANEL("solar-panel.svg"),
		SOLAR_POWER("solar-power.svg"),
		SOLID("solid.svg"),
		SORT_ALPHABETICAL("sort-alphabetical.svg"),
		SORT_ASCENDING("sort-ascending.svg"),
		SORT_DESCENDING("sort-descending.svg"),
		SORT_NUMERIC("sort-numeric.svg"),
		SORT_VARIANT_LOCK_OPEN("sort-variant-lock-open.svg"),
		SORT_VARIANT_LOCK("sort-variant-lock.svg"),
		SORT_VARIANT("sort-variant.svg"),
		SORT("sort.svg"),
		SOUNDCLOUD("soundcloud.svg"),
		SOY_SAUCE("soy-sauce.svg"),
		SPA_OUTLINE("spa-outline.svg"),
		SPA("spa.svg"),
		SPACE_INVADERS("space-invaders.svg"),
		SPADE("spade.svg"),
		SPEAKER_BLUETOOTH("speaker-bluetooth.svg"),
		SPEAKER_MULTIPLE("speaker-multiple.svg"),
		SPEAKER_OFF("speaker-off.svg"),
		SPEAKER_WIRELESS("speaker-wireless.svg"),
		SPEAKER("speaker.svg"),
		SPEEDOMETER("speedometer.svg"),
		SPELLCHECK("spellcheck.svg"),
		SPIDER_WEB("spider-web.svg"),
		SPLIT_HORIZONTAL("split-horizontal.svg"),
		SPLIT_VERTICAL("split-vertical.svg"),
		SPOTIFY("spotify.svg"),
		SPOTLIGHT_BEAM("spotlight-beam.svg"),
		SPOTLIGHT("spotlight.svg"),
		SPRAY_BOTTLE("spray-bottle.svg"),
		SPRAY("spray.svg"),
		SPREADSHEET("spreadsheet.svg"),
		SPROUT_OUTLINE("sprout-outline.svg"),
		SPROUT("sprout.svg"),
		SQUARE_EDIT_OUTLINE("square-edit-outline.svg"),
		SQUARE_INC_CASH("square-inc-cash.svg"),
		SQUARE_INC("square-inc.svg"),
		SQUARE_MEDIUM_OUTLINE("square-medium-outline.svg"),
		SQUARE_MEDIUM("square-medium.svg"),
		SQUARE_OUTLINE("square-outline.svg"),
		SQUARE_ROOT_BOX("square-root-box.svg"),
		SQUARE_ROOT("square-root.svg"),
		SQUARE_SMALL("square-small.svg"),
		SQUARE("square.svg"),
		SQUEEGEE("squeegee.svg"),
		SSH("ssh.svg"),
		STACKEXCHANGE("stackexchange.svg"),
		STACKOVERFLOW("stackoverflow.svg"),
		STADIUM("stadium.svg"),
		STAIRS("stairs.svg"),
		STAMPER("stamper.svg"),
		STANDARD_DEFINITION("standard-definition.svg"),
		STAR("star.svg"),
		STEAM_BOX("steam-box.svg"),
		STEAM("steam.svg"),
		STEERING_OFF("steering-off.svg"),
		STEERING("steering.svg"),
		STEP_BACKWARD_2("step-backward-2.svg"),
		STEP_BACKWARD("step-backward.svg"),
		STEP_FORWARD_2("step-forward-2.svg"),
		STEP_FORWARD("step-forward.svg"),
		STETHOSCOPE("stethoscope.svg"),
		STICKER_EMOJI("sticker-emoji.svg"),
		STICKER("sticker.svg"),
		STOCKING("stocking.svg"),
		STOP_CIRCLE_OUTLINE("stop-circle-outline.svg"),
		STOP_CIRCLE("stop-circle.svg"),
		STOP("stop.svg"),
		STORE_24_HOUR("store-24-hour.svg"),
		STORE("store.svg"),
		STOVE("stove.svg"),
		STRAVA("strava.svg"),
		SUBDIRECTORY_ARROW_LEFT("subdirectory-arrow-left.svg"),
		SUBDIRECTORY_ARROW_RIGHT("subdirectory-arrow-right.svg"),
		SUBTITLES_OUTLINE("subtitles-outline.svg"),
		SUBTITLES("subtitles.svg"),
		SUBWAY_ALERT_VARIANT("subway-alert-variant.svg"),
		SUBWAY_VARIANT("subway-variant.svg"),
		SUBWAY("subway.svg"),
		SUMMIT("summit.svg"),
		SUNGLASSES("sunglasses.svg"),
		SURROUND_SOUND_2_0("surround-sound-2-0.svg"),
		SURROUND_SOUND_3_1("surround-sound-3-1.svg"),
		SURROUND_SOUND_5_1("surround-sound-5-1.svg"),
		SURROUND_SOUND_7_1("surround-sound-7-1.svg"),
		SURROUND_SOUND("surround-sound.svg"),
		SVG("svg.svg"),
		SWAP_HORIZONTAL_BOLD("swap-horizontal-bold.svg"),
		SWAP_HORIZONTAL_VARIANT("swap-horizontal-variant.svg"),
		SWAP_HORIZONTAL("swap-horizontal.svg"),
		SWAP_VERTICAL_BOLD("swap-vertical-bold.svg"),
		SWAP_VERTICAL_VARIANT("swap-vertical-variant.svg"),
		SWAP_VERTICAL("swap-vertical.svg"),
		SWIM("swim.svg"),
		SWITCH("switch.svg"),
		SWORD_CROSS("sword-cross.svg"),
		SWORD("sword.svg"),
		SYMFONY("symfony.svg"),
		SYNC_ALERT("sync-alert.svg"),
		SYNC_OFF("sync-off.svg"),
		SYNC("sync.svg"),
		TAB_MINUS("tab-minus.svg"),
		TAB_PLUS("tab-plus.svg"),
		TAB_REMOVE("tab-remove.svg"),
		TAB_UNSELECTED("tab-unselected.svg"),
		TAB("tab.svg"),
		TABLE("table.svg"),
		TABLET_ANDROID("tablet-android.svg"),
		TABLET_CELLPHONE("tablet-cellphone.svg"),
		TABLET_IPAD("tablet-ipad.svg"),
		TABLET("tablet.svg"),
		TACO("taco.svg"),
		TAG_FACES("tag-faces.svg"),
		TAG_HEART_OUTLINE("tag-heart-outline.svg"),
		TAG_HEART("tag-heart.svg"),
		TAG_MINUS("tag-minus.svg"),
		TAG_MULTIPLE("tag-multiple.svg"),
		TAG_OUTLINE("tag-outline.svg"),
		TAG_PLUS("tag-plus.svg"),
		TAG_REMOVE("tag-remove.svg"),
		TAG_TEXT_OUTLINE("tag-text-outline.svg"),
		TAG("tag.svg"),
		TANK("tank.svg"),
		TAPE_MEASURE("tape-measure.svg"),
		TARGET_ACCOUNT("target-account.svg"),
		TARGET_VARIANT("target-variant.svg"),
		TARGET("target.svg"),
		TAXI("taxi.svg"),
		TEA_OUTLINE("tea-outline.svg"),
		TEA("tea.svg"),
		TEACH("teach.svg"),
		TEAMSPEAK("teamspeak.svg"),
		TEAMVIEWER("teamviewer.svg"),
		TELEGRAM("telegram.svg"),
		TELESCOPE("telescope.svg"),
		TELEVISION_BOX("television-box.svg"),
		TELEVISION_CLASSIC_OFF("television-classic-off.svg"),
		TELEVISION_CLASSIC("television-classic.svg"),
		TELEVISION_GUIDE("television-guide.svg"),
		TELEVISION_OFF("television-off.svg"),
		TELEVISION("television.svg"),
		TEMPERATURE_CELSIUS("temperature-celsius.svg"),
		TEMPERATURE_FAHRENHEIT("temperature-fahrenheit.svg"),
		TEMPERATURE_KELVIN("temperature-kelvin.svg"),
		TENNIS_BALL("tennis-ball.svg"),
		TENNIS("tennis.svg"),
		TENT("tent.svg"),
		TERRAIN("terrain.svg"),
		TEST_TUBE_EMPTY("test-tube-empty.svg"),
		TEST_TUBE_OFF("test-tube-off.svg"),
		TEST_TUBE("test-tube.svg"),
		TEXT_SHADOW("text-shadow.svg"),
		TEXT_SHORT("text-short.svg"),
		TEXT_SUBJECT("text-subject.svg"),
		TEXT_TO_SPEECH_OFF("text-to-speech-off.svg"),
		TEXT_TO_SPEECH("text-to-speech.svg"),
		TEXT("text.svg"),
		TEXTBOX_PASSWORD("textbox-password.svg"),
		TEXTBOX("textbox.svg"),
		TEXTURE("texture.svg"),
		THEATER("theater.svg"),
		THEME_LIGHT_DARK("theme-light-dark.svg"),
		THERMOMETER_ALERT("thermometer-alert.svg"),
		THERMOMETER_CHEVRON_DOWN("thermometer-chevron-down.svg"),
		THERMOMETER_CHEVRON_UP("thermometer-chevron-up.svg"),
		THERMOMETER_LINES("thermometer-lines.svg"),
		THERMOMETER_MINUS("thermometer-minus.svg"),
		THERMOMETER_PLUS("thermometer-plus.svg"),
		THERMOMETER("thermometer.svg"),
		THERMOSTAT_BOX("thermostat-box.svg"),
		THOUGHT_BUBBLE_OUTLINE("thought-bubble-outline.svg"),
		THOUGHT_BUBBLE("thought-bubble.svg"),
		THUMB_DOWN_OUTLINE("thumb-down-outline.svg"),
		THUMB_DOWN("thumb-down.svg"),
		THUMB_UP_OUTLINE("thumb-up-outline.svg"),
		THUMB_UP("thumb-up.svg"),
		THUMBS_UP_DOWN("thumbs-up-down.svg"),
		TICKET_ACCOUNT("ticket-account.svg"),
		TICKET_CONFIRMATION("ticket-confirmation.svg"),
		TICKET_OUTLINE("ticket-outline.svg"),
		TICKET_PERCENT("ticket-percent.svg"),
		TICKET("ticket.svg"),
		TIE("tie.svg"),
		TILDE("tilde.svg"),
		TIMELAPSE("timelapse.svg"),
		TIMELINE_OUTLINE("timeline-outline.svg"),
		TIMELINE_TEXT_OUTLINE("timeline-text-outline.svg"),
		TIMELINE_TEXT("timeline-text.svg"),
		TIMELINE("timeline.svg"),
		TIMER_10("timer-10.svg"),
		TIMER_3("timer-3.svg"),
		TIMER_OFF("timer-off.svg"),
		TIMER_SAND_EMPTY("timer-sand-empty.svg"),
		TIMER_SAND_FULL("timer-sand-full.svg"),
		TIMER_SAND("timer-sand.svg"),
		TIMER("timer.svg"),
		TIMETABLE("timetable.svg"),
		TOASTER_OVEN("toaster-oven.svg"),
		TOGGLE_SWITCH_OFF_OUTLINE("toggle-switch-off-outline.svg"),
		TOGGLE_SWITCH_OFF("toggle-switch-off.svg"),
		TOGGLE_SWITCH_OUTLINE("toggle-switch-outline.svg"),
		TOGGLE_SWITCH("toggle-switch.svg"),
		TOILET("toilet.svg"),
		TOOLBOX_OUTLINE("toolbox-outline.svg"),
		TOOLBOX("toolbox.svg"),
		TOOLTIP_ACCOUNT("tooltip-account.svg"),
		TOOLTIP_EDIT("tooltip-edit.svg"),
		TOOLTIP_IMAGE_OUTLINE("tooltip-image-outline.svg"),
		TOOLTIP_IMAGE("tooltip-image.svg"),
		TOOLTIP_OUTLINE("tooltip-outline.svg"),
		TOOLTIP_PLUS_OUTLINE("tooltip-plus-outline.svg"),
		TOOLTIP_PLUS("tooltip-plus.svg"),
		TOOLTIP_TEXT_OUTLINE("tooltip-text-outline.svg"),
		TOOLTIP_TEXT("tooltip-text.svg"),
		TOOLTIP("tooltip.svg"),
		TOOTH_OUTLINE("tooth-outline.svg"),
		TOOTH("tooth.svg"),
		TOR("tor.svg"),
		TORTOISE("tortoise.svg"),
		TOURNAMENT("tournament.svg"),
		TOWER_BEACH("tower-beach.svg"),
		TOWER_FIRE("tower-fire.svg"),
		TOWING("towing.svg"),
		TRACK_LIGHT("track-light.svg"),
		TRACKPAD_LOCK("trackpad-lock.svg"),
		TRACKPAD("trackpad.svg"),
		TRACTOR("tractor.svg"),
		TRADEMARK("trademark.svg"),
		TRAFFIC_LIGHT("traffic-light.svg"),
		TRAIN_CAR("train-car.svg"),
		TRAIN_VARIANT("train-variant.svg"),
		TRAIN("train.svg"),
		TRAM("tram.svg"),
		TRANSCRIBE_CLOSE("transcribe-close.svg"),
		TRANSCRIBE("transcribe.svg"),
		TRANSFER_DOWN("transfer-down.svg"),
		TRANSFER_LEFT("transfer-left.svg"),
		TRANSFER_RIGHT("transfer-right.svg"),
		TRANSFER_UP("transfer-up.svg"),
		TRANSIT_CONNECTION_VARIANT("transit-connection-variant.svg"),
		TRANSIT_CONNECTION("transit-connection.svg"),
		TRANSIT_TRANSFER("transit-transfer.svg"),
		TRANSITION_MASKED("transition-masked.svg"),
		TRANSITION("transition.svg"),
		TRANSLATE_OFF("translate-off.svg"),
		TRANSLATE("translate.svg"),
		TRANSMISSION_TOWER("transmission-tower.svg"),
		TRASH_CAN_OUTLINE("trash-can-outline.svg"),
		TRASH_CAN("trash-can.svg"),
		TRASH("trash.svg"),
		TREASURE_CHEST("treasure-chest.svg"),
		TREE_OUTLINE("tree-outline.svg"),
		TREE("tree.svg"),
		TRELLO("trello.svg"),
		TRENDING_DOWN("trending-down.svg"),
		TRENDING_NEUTRAL("trending-neutral.svg"),
		TRENDING_UP("trending-up.svg"),
		TRIANGLE_OUTLINE("triangle-outline.svg"),
		TRIANGLE("triangle.svg"),
		TRIFORCE("triforce.svg"),
		TROPHY_BROKEN("trophy-broken.svg"),
		TROPHY_OUTLINE("trophy-outline.svg"),
		TROPHY_VARIANT_OUTLINE("trophy-variant-outline.svg"),
		TRUCK_CHECK("truck-check.svg"),
		TRUCK_DELIVERY("truck-delivery.svg"),
		TRUCK_FAST("truck-fast.svg"),
		TRUCK_TRAILER("truck-trailer.svg"),
		TRUCK("truck.svg"),
		TSHIRT_CREW_OUTLINE("tshirt-crew-outline.svg"),
		TSHIRT_CREW("tshirt-crew.svg"),
		TSHIRT_V_OUTLINE("tshirt-v-outline.svg"),
		TSHIRT_V("tshirt-v.svg"),
		TUMBLE_DRYER("tumble-dryer.svg"),
		TUMBLR_BOX("tumblr-box.svg"),
		TUMBLR_REBLOG("tumblr-reblog.svg"),
		TUMBLR("tumblr.svg"),
		TUNE_VERTICAL("tune-vertical.svg"),
		TUNE("tune.svg"),
		TURNSTILE_OUTLINE("turnstile-outline.svg"),
		TURNSTILE("turnstile.svg"),
		TURTLE("turtle.svg"),
		TWITCH("twitch.svg"),
		TWITTER_BOX("twitter-box.svg"),
		TWITTER_CIRCLE("twitter-circle.svg"),
		TWITTER_RETWEET("twitter-retweet.svg"),
		TWITTER("twitter.svg"),
		TWO_FACTOR_AUTHENTICATION("two-factor-authentication.svg"),
		UBER("uber.svg"),
		UBISOFT("ubisoft.svg"),
		UBUNTU("ubuntu.svg"),
		ULTRA_HIGH_DEFINITION("ultra-high-definition.svg"),
		UMBRACO("umbraco.svg"),
		UMBRELLA_CLOSED("umbrella-closed.svg"),
		UMBRELLA_OUTLINE("umbrella-outline.svg"),
		UMBRELLA("umbrella.svg"),
		UNDO_VARIANT("undo-variant.svg"),
		UNDO("undo.svg"),
		UNFOLD_LESS_HORIZONTAL("unfold-less-horizontal.svg"),
		UNFOLD_LESS_VERTICAL("unfold-less-vertical.svg"),
		UNFOLD_MORE_HORIZONTAL("unfold-more-horizontal.svg"),
		UNFOLD_MORE_VERTICAL("unfold-more-vertical.svg"),
		UNGROUP("ungroup.svg"),
		UNITY("unity.svg"),
		UNREAL("unreal.svg"),
		UNTAPPD("untappd.svg"),
		UPDATE("update.svg"),
		UPLOAD_MULTIPLE("upload-multiple.svg"),
		UPLOAD_NETWORK_OUTLINE("upload-network-outline.svg"),
		UPLOAD_NETWORK("upload-network.svg"),
		UPLOAD_OUTLINE("upload-outline.svg"),
		UPLOAD("upload.svg"),
		USB("usb.svg"),
		VAN_PASSENGER("van-passenger.svg"),
		VAN_UTILITY("van-utility.svg"),
		VANISH("vanish.svg"),
		VARIABLE("variable.svg"),
		VENMO("venmo.svg"),
		VERIFIED("verified.svg"),
		VHS("vhs.svg"),
		VIBRATE_OFF("vibrate-off.svg"),
		VIBRATE("vibrate.svg"),
		VIDEO("video.svg"),
		VIMEO("vimeo.svg"),
		VINE("vine.svg"),
		VIOLIN("violin.svg"),
		VIRTUAL_REALITY("virtual-reality.svg"),
		VISUAL_STUDIO_CODE("visual-studio-code.svg"),
		VISUAL_STUDIO("visual-studio.svg"),
		VK_BOX("vk-box.svg"),
		VK_CIRCLE("vk-circle.svg"),
		VK("vk.svg"),
		VLC("vlc.svg"),
		VOICE("voice.svg"),
		VOICEMAIL("voicemail.svg"),
		VOLLEYBALL("volleyball.svg"),
		VOLUME_HIGH("volume-high.svg"),
		VOLUME_LOW("volume-low.svg"),
		VOLUME_MEDIUM("volume-medium.svg"),
		VOLUME_MINUS("volume-minus.svg"),
		VOLUME_MUTE("volume-mute.svg"),
		VOLUME_OFF("volume-off.svg"),
		VOLUME_PLUS("volume-plus.svg"),
		VOLUME_VARIANT_OFF("volume-variant-off.svg"),
		VOLUME("volume.svg"),
		VOTE_OUTLINE("vote-outline.svg"),
		VOTE("vote.svg"),
		VPN("vpn.svg"),
		VUEJS("vuejs.svg"),
		WALK("walk.svg"),
		WALL_SCONCE_FLAT("wall-sconce-flat.svg"),
		WALL_SCONCE_VARIANT("wall-sconce-variant.svg"),
		WALL_SCONCE("wall-sconce.svg"),
		WALL("wall.svg"),
		WALLET_GIFTCARD("wallet-giftcard.svg"),
		WALLET_MEMBERSHIP("wallet-membership.svg"),
		WALLET_OUTLINE("wallet-outline.svg"),
		WALLET_TRAVEL("wallet-travel.svg"),
		WALLET("wallet.svg"),
		WALLPAPER("wallpaper.svg"),
		WAN("wan.svg"),
		WASHING_MACHINE("washing-machine.svg"),
		WATCH_EXPORT_VARIANT("watch-export-variant.svg"),
		WATCH_EXPORT("watch-export.svg"),
		WATCH_IMPORT_VARIANT("watch-import-variant.svg"),
		WATCH_IMPORT("watch-import.svg"),
		WATCH_VARIANT("watch-variant.svg"),
		WATCH_VIBRATE_OFF("watch-vibrate-off.svg"),
		WATCH_VIBRATE("watch-vibrate.svg"),
		WATCH("watch.svg"),
		WATER_OFF("water-off.svg"),
		WATER_OUTLINE("water-outline.svg"),
		WATER_PERCENT("water-percent.svg"),
		WATER_PUMP("water-pump.svg"),
		WATER("water.svg"),
		WATERMARK("watermark.svg"),
		WAVES("waves.svg"),
		WAZE("waze.svg"),
		WEB("web.svg"),
		WEBCAM("webcam.svg"),
		WEBHOOK("webhook.svg"),
		WEBPACK("webpack.svg"),
		WECHAT("wechat.svg"),
		WEIGHT_GRAM("weight-gram.svg"),
		WEIGHT_KILOGRAM("weight-kilogram.svg"),
		WEIGHT_POUND("weight-pound.svg"),
		WEIGHT("weight.svg"),
		WHATSAPP("whatsapp.svg"),
		WHEELCHAIR_ACCESSIBILITY("wheelchair-accessibility.svg"),
		WHISTLE("whistle.svg"),
		WHITE_BALANCE_AUTO("white-balance-auto.svg"),
		WHITE_BALANCE_INCANDESCENT("white-balance-incandescent.svg"),
		WHITE_BALANCE_IRIDESCENT("white-balance-iridescent.svg"),
		WHITE_BALANCE_SUNNY("white-balance-sunny.svg"),
		WIDGETS("widgets.svg"),
		WIFI("wifi.svg"),
		WII("wii.svg"),
		WIIU("wiiu.svg"),
		WIKIPEDIA("wikipedia.svg"),
		WIND_TURBINE("wind-turbine.svg"),
		WINDOW_CLOSE("window-close.svg"),
		WINDOW_CLOSED("window-closed.svg"),
		WINDOW_MAXIMIZE("window-maximize.svg"),
		WINDOW_MINIMIZE("window-minimize.svg"),
		WINDOW_OPEN("window-open.svg"),
		WINDOW_RESTORE("window-restore.svg"),
		WINDOWS_CLASSIC("windows-classic.svg"),
		WINDOWS("windows.svg"),
		WIPER_WASH("wiper-wash.svg"),
		WIPER("wiper.svg"),
		WORDPRESS("wordpress.svg"),
		WORKER("worker.svg"),
		WRAP_DISABLED("wrap-disabled.svg"),
		WRENCH_OUTLINE("wrench-outline.svg"),
		WRENCH("wrench.svg"),
		WUNDERLIST("wunderlist.svg"),
		XAMARIN_OUTLINE("xamarin-outline.svg"),
		XAMARIN("xamarin.svg"),
		XAML("xaml.svg"),
		XBOX("xbox.svg"),
		XDA("xda.svg"),
		XING_BOX("xing-box.svg"),
		XING_CIRCLE("xing-circle.svg"),
		XING("xing.svg"),
		XML("xml.svg"),
		XMPP("xmpp.svg"),
		YAHOO("yahoo.svg"),
		YAMMER("yammer.svg"),
		YEAST("yeast.svg"),
		YELP("yelp.svg"),
		YIN_YANG("yin-yang.svg"),
		YOUTUBE_CREATOR_STUDIO("youtube-creator-studio.svg"),
		YOUTUBE_GAMING("youtube-gaming.svg"),
		YOUTUBE_PLAY("youtube-play.svg"),
		YOUTUBE_SUBSCRIPTION("youtube-subscription.svg"),
		YOUTUBE_TV("youtube-tv.svg"),
		YOUTUBE("youtube.svg"),
		Z_WAVE("z-wave.svg"),
		ZEND("zend.svg"),
		ZIGBEE("zigbee.svg"),
		ZIP_BOX("zip-box.svg"),
		ZIP_DISK("zip-disk.svg"),
		;
		private String name;

		DEFAULT(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}

	public enum HOME implements SimpleIcon {
		ACCOUNT("home-account.svg"),
		ALERT("home-alert.svg"),
		ASSISTANT("home-assistant.svg"),
		AUTOMATION("home-automation.svg"),
		CIRCLE("home-circle.svg"),
		CITY_OUTLINE("home-city-outline.svg"),
		CITY("home-city.svg"),
		CURRENCY_USD("home-currency-usd.svg"),
		FLOOR_0("home-floor-0.svg"),
		FLOOR_NEGATIVE_1("home-floor-negative-1.svg"),
		GROUP("home-group.svg"),
		HEART("home-heart.svg"),
		LOCK_OPEN("home-lock-open.svg"),
		LOCK("home-lock.svg"),
		MAP_MARKER("home-map-marker.svg"),
		MINUS("home-minus.svg"),
		MODERN("home-modern.svg"),
		OUTLINE("home-outline.svg"),
		PLUS("home-plus.svg"),
		VARIANT_OUTLINE("home-variant-outline.svg"),
		VARIANT("home-variant.svg"),
		;
		private String name;

		HOME(String name) {
			this.name = name;
		}

		@Override
		public String getIconName() {
			return name;
		}

		@Override
		public String getIconLibraryId() {
			return MaterialDesignIconProvider.LIBRARY_ID;
		}

		public Icon withStyle(SingleColorStyle style) {
			return new StyledIcon(getIconLibraryId(), style.getStyleId(), getIconName());
		}
	}
}
