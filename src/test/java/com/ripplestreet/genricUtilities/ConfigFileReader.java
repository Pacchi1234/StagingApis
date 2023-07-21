package com.ripplestreet.genricUtilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath = "src//test//resources//config//Config.properties";
	private static ConfigFileReader configFileReader = new ConfigFileReader();

	private ConfigFileReader() {
		try {
			FileReader reader = new FileReader(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}

	}

	public static ConfigFileReader getInstance() {
		return configFileReader;
	}

	public String getBaseURI() {
		String baseURI = properties.getProperty("BaseURI");
		if (baseURI != null)
			return baseURI;
		else
			throw new RuntimeException("baseURI is not specified in the Configuration.properties file.");
	}

	public String getEventId() {
		String eventID = properties.getProperty("eventId");
		if (eventID != null)
			return eventID;
		else
			throw new RuntimeException("eventID is not specified in the Configuration.properties file.");
	}

	public String getPage() {
		String page = properties.getProperty("page");
		if (page != null)
			return page;
		else
			throw new RuntimeException("page is not specified in the Configuration.properties file");
	}

	public String getSize() {
		String size = properties.getProperty("size");
		if (size != null)
			return size;
		else
			throw new RuntimeException("size is not specified in the Configuration.properties file");

	}

	public String getActivitiesName() {
		String activitiesName = properties.getProperty("activitiesName");
		if (activitiesName != null)
			return activitiesName;
		else
			throw new RuntimeException("activitiesName is not specified in the Configuration.properties file");
	}

	public String getPid() {
		String pid = properties.getProperty("pid");
		if (pid != null)
			return pid;
		else
			throw new RuntimeException("pid is not specified in the configuration.properties file");
	}

	public String getSlugValue() {
		String slug = properties.getProperty("slug");
		if (slug != null)
			return slug;
		else
			throw new RuntimeException("slug is not specified in the configuration.properies file");

	}

	public String getProductId() {
		String productId = properties.getProperty("productId");
		if (productId != null)
			return productId;
		else
			throw new RuntimeException("productId is not specified in the configuration.properties file");
	}

	public String getByEventName() {
		String eventName = properties.getProperty("eventName");
		if (eventName != null)
			return eventName;
		else
			throw new RuntimeException("eventName is not apecified in the configuration.properties file");
	}

	public String getdevApiPath() {
		String devApiPath = properties.getProperty("devApiPath");
		if (devApiPath != null)
			return devApiPath;
		else
			throw new RuntimeException("devApipath is not specified in the configuration.properties file");
	}

	public String getpackCount() {
		String packCount = properties.getProperty("packCount");
		if (packCount != null)
			return packCount;
		else
			throw new RuntimeException("packCount is not specified in the congifiguration.properties file");
	}

	public String getfeedItemId() {
		String feedItemId = properties.getProperty("feedItemId");
		if (feedItemId != null)
			return feedItemId;
		else
			throw new RuntimeException("feedIteamId is not specified in the configuration.properties file");

	}

	public String getExcelSheetPageName() {
		String ExcelSheetPageName = properties.getProperty("ExcelSheetPageName");
		if (ExcelSheetPageName != null)
			return ExcelSheetPageName;
		else
			throw new RuntimeException("ExcelSheetPageName is not specified in the properties file");
	}

	public String getfeedType() {
		String feedType = properties.getProperty("feedType");
		if (feedType != null)
			return feedType;
		else
			throw new RuntimeException("feedType is not mentioned in the Configuration.properties file");
	}

	public String getdiscussion_id() {
		String discussion_id = properties.getProperty("discussion_id");
		if (discussion_id != null)
			return discussion_id;
		else
			throw new RuntimeException("id is not mentioned in the Configuration.properties file");
	}

	public String getmodel() {
		String model = properties.getProperty("model");
		if (model != null)
			return model;
		else
			throw new RuntimeException("model is not mentioned int the configuration.properties file");
	}

	public String getcomment() {
		String comment = properties.getProperty("comment");
		if (comment != null)
			return comment;
		else
			throw new RuntimeException("comment is not mentioned in the configuration.properties file");
	}

	public String getipAddress() {
		String ipAddress = properties.getProperty("comment");
		if (ipAddress != null)
			return ipAddress;
		else
			throw new RuntimeException("ipAddress is not mentioned in the Configuration.properties file");
	}

	public String getAmazonBaseURL() {
		String amazoneURI = properties.getProperty("amazoneURI");
		if (amazoneURI != null)
			return amazoneURI;
		else
			throw new RuntimeException("amazoneURI is not mentioned in the Configuration.properties file");
	}

	public String getugcTaskId() {
		String ugctaskId = properties.getProperty("ugctaskId");
		if (ugctaskId != null)
			return ugctaskId;
		else
			throw new RuntimeException("ugctaskId Is not mentioned in the configuration.properties file");
	}

	public String ugcId() {
		String ugcId = properties.getProperty("ugcId");
		if (ugcId != null)
			return ugcId;
		else
			throw new RuntimeException("ugcId Is not mentioned in the configuration.properties file");
	}

	public String getAssetId() {
		String assetId = properties.getProperty("assetId");
		if (assetId != null)
			return assetId;
		else
			throw new RuntimeException("assetId Is not mentioned in the configuration.properties file");
	}

	public String getreviewId() {
		String reviewId = properties.getProperty("reviewId");
		if (reviewId != null)
			return reviewId;
		else
			throw new RuntimeException("reviewId Is not mentioned in the configuration.properties file");
	}

	public String getbenifitsPlatformUrl() {
		String benifitsPlatformUrl = properties.getProperty("benifitsPlatformUrl");
		if (benifitsPlatformUrl != null)
			return benifitsPlatformUrl;
		else
			throw new RuntimeException("benifitsPlatformUrl Is not mentioned in the configuration.properties file");
	}

	public String getachievementId() {
		String achievementId = properties.getProperty("achievementId");
		if (achievementId != null)
			return achievementId;
		else
			throw new RuntimeException("achievementId Is not mentioned in the configuration.properties file");
	}

	public String gettriggerId() {
		String triggerId = properties.getProperty("triggerId");
		if (triggerId != null)
			return triggerId;
		else
			throw new RuntimeException("triggerId Is not mentioned in the configuration.properties file");
	}

	public String getAchievementProgramId() {
		String AchievementProgramId = properties.getProperty("AchievementProgramId");
		if (AchievementProgramId != null)
			return AchievementProgramId;
		else
			throw new RuntimeException("AchievementProgramId Is not mentioned in the configuration.properties file");
	}

	public String getbenifitType() {
		String benifitType = properties.getProperty("benifitType");
		if (benifitType != null)
			return benifitType;
		else
			throw new RuntimeException("benifitType Is not mentioned in the configuration.properties file");
	}

	public String getactivityId() {
		String activityId = properties.getProperty("activityId");
		if (activityId != null)
			return activityId;
		else
			throw new RuntimeException("activityId Is not mentioned in the configuration.properties file");
	}

	public String getactivitygroupId() {
		String activitygroupId = properties.getProperty("activitygroupId");
		if (activitygroupId != null)
			return activitygroupId;
		else
			throw new RuntimeException("activitygroupId Is not mentioned in the configuration.properties file");
	}

	public String gettaskId() {
		String taskId = properties.getProperty("taskId");
		if (taskId != null)
			return taskId;
		else
			throw new RuntimeException("taskId Is not mentioned in the configuration.properties file");
	}

	public String getstatus() {
		String status = properties.getProperty("status");
		if (status != null)
			return status;
		else
			throw new RuntimeException("status Is not mentioned in the configuration.properties file");
	}

	public String getsegmentId() {
		String segmentId = properties.getProperty("segmentId");
		if (segmentId != null)
			return segmentId;
		else
			throw new RuntimeException("segmentId Is not mentioned in the configuration.properties file");
	}

	public String getsegmentName() {
		String segmentName = properties.getProperty("segmentName");
		if (segmentName != null)
			return segmentName;
		else
			throw new RuntimeException("segmentName Is not mentioned in the configuration.properties file");
	}

	public String getFolderId() {
		String folderId = properties.getProperty("folderId");
		if (folderId != null)
			return folderId;
		else
			throw new RuntimeException("folderId Is not mentioned in the configuration.properties file");
	}

	public String getsegmentationtriggerId() {
		String segmentationtriggerId = properties.getProperty("segmentationtriggerId");
		if (segmentationtriggerId != null)
			return segmentationtriggerId;
		else
			throw new RuntimeException("segmentationtriggerId Is not mentioned in the configuration.properties file");
	}

	public String gettableName() {
		String tableName = properties.getProperty("tableName");
		if (tableName != null)
			return tableName;
		else
			throw new RuntimeException("tableName Is not mentioned in the configuration.properties file");
	}

	public String getoperation() {
		String operation = properties.getProperty("operation");
		if (operation != null)
			return operation;
		else
			throw new RuntimeException("operation Is not mentioned in the configuration.properties file");
	}

	public String getgamificationActivityId() {
		String gamificationActivityId = properties.getProperty("gamificationActivityId");
		if (gamificationActivityId != null)
			return gamificationActivityId;
		else
			throw new RuntimeException("gamificationActivityId Is not mentioned in the configuration.properties file");
	}

	public String getcolumnName() {
		String columnName = properties.getProperty("columnName");
		if (columnName != null)
			return columnName;
		else
			throw new RuntimeException("columnName Is not mentioned in the configuration.properties file");
	}

	public String getdirectionDESC() {
		String directionDESC = properties.getProperty("directionDESC");
		if (directionDESC != null)
			return directionDESC;
		else
			throw new RuntimeException("directionDESC Is not mentioned in the configuration.properties file");
	}

	public String getgamespageNo() {
		String gamespageNo = properties.getProperty("gamespageNo");
		if (gamespageNo != null)
			return gamespageNo;
		else
			throw new RuntimeException("gamespageNo Is not mentioned in the configuration.properties file");
	}

	public String getgameId() {
		String gameId = properties.getProperty("gameId");
		if (gameId != null)
			return gameId;
		else
			throw new RuntimeException("gameId Is not mentioned in the configuration.properties file");
	}

	public String getgameSlug() {
		String gameSlug = properties.getProperty("gameSlug");
		if (gameSlug != null)
			return gameSlug;
		else
			throw new RuntimeException("gameSlug Is not mentioned in the configuration.properties file");
	}

	public String getjobId() {
		String jobId = properties.getProperty("jobId");
		if (jobId != null)
			return jobId;
		else
			throw new RuntimeException("jobId Is not mentioned in the configuration.properties file");
	}

	public String getsourceType() {
		String sourceType = properties.getProperty("sourceType");
		if (sourceType != null)
			return sourceType;
		else
			throw new RuntimeException("sourceType Is not mentioned in the configuration.properties file");
	}

	public String getreceiptId() {
		String receiptId = properties.getProperty("receiptId");
		if (receiptId != null)
			return receiptId;
		else
			throw new RuntimeException("receiptId Is not mentioned in the configuration.properties file");
	}

	public String getcollectionName() {
		String collectionName = properties.getProperty("collectionName");
		if (collectionName != null)
			return collectionName;
		else
			throw new RuntimeException("collectionName Is not mentioned in the configuration.properties file");
	}

	public String getoptInId() {
		String optInId = properties.getProperty("optInId");
		if (optInId != null)
			return optInId;
		else
			throw new RuntimeException("optInId Is not mentioned in the configuration.properties file");
	}

	public String getrewardAllocationId() {
		String rewardAllocationId = properties.getProperty("rewardAllocationId");
		if (rewardAllocationId != null)
			return rewardAllocationId;
		else
			throw new RuntimeException("rewardAllocationId Is not mentioned in the configuration.properties file");
	}

	public String getrewardId() {
		String rewardId = properties.getProperty("rewardId");
		if (rewardId != null)
			return rewardId;
		else
			throw new RuntimeException("rewardId Is not mentioned in the configuration.properties file");
	}

	public String getrewardName() {
		String rewardName = properties.getProperty("rewardName");
		if (rewardName != null)
			return rewardName;
		else
			throw new RuntimeException("rewardName Is not mentioned in the configuration.properties file");
	}

	public String getdeliveryType() {
		String deliveryType = properties.getProperty("deliveryType");
		if (deliveryType != null)
			return deliveryType;
		else
			throw new RuntimeException("deliveryType Is not mentioned in the configuration.properties file");
	}

	public String getswagId() {
		String swagId = properties.getProperty("swagId");
		if (swagId != null)
			return swagId;
		else
			throw new RuntimeException("swagId Is not mentioned in the configuration.properties file");
	}

	public String getnotificationId() {
		String notificationId = properties.getProperty("notificationId");
		if (notificationId != null)
			return notificationId;
		else
			throw new RuntimeException("notificationId Is not mentioned in the configuration.properties file");
	}

	public String getcampaignName() {
		String campaignName = properties.getProperty("campaignName");
		if (campaignName != null)
			return campaignName;
		else
			throw new RuntimeException("campaignName Is not mentioned in the configuration.properties file");
	}

	public String getemail() {
		String email = properties.getProperty("email");
		if (email != null)
			return email;
		else
			throw new RuntimeException("email Is not mentioned in the configuration.properties file");
	}

	public String gettemplateName() {
		String templateName = properties.getProperty("templateName");
		if (templateName != null)
			return templateName;
		else
			throw new RuntimeException("templateName Is not mentioned in the configuration.properties file");
	}

	public String gettemplateType() {
		String templateType = properties.getProperty("templateType");
		if (templateType != null)
			return templateType;
		else
			throw new RuntimeException("templateType Is not mentioned in the configuration.properties file");
	}

	public String gettemplateTypeEnum() {
		String templateTypeEnum = properties.getProperty("templateTypeEnum");
		if (templateTypeEnum != null)
			return templateTypeEnum;
		else
			throw new RuntimeException("templateTypeEnum Is not mentioned in the configuration.properties file");
	}

	public String gettransactionType() {
		String transactionlType = properties.getProperty("transactionlType");
		if (transactionlType != null)
			return transactionlType;
		else
			throw new RuntimeException("transactionlType Is not mentioned in the configuration.properties file");
	}

	public String getFileName() {
		String fileName = properties.getProperty("fileName");
		if (fileName != null)
			return fileName;
		else
			throw new RuntimeException("fileName Is not mentioned in the configuration.properties file");
	}

	public String gettransactionTemplateId() {
		String transactionTemplateId = properties.getProperty("transactionTemplateId");
		if (transactionTemplateId != null)
			return transactionTemplateId;
		else
			throw new RuntimeException("transactionTemplateId Is not mentioned in the configuration.properties file");
	}

	public String getmatrixNotificationId() {
		String matrixNotificationId = properties.getProperty("matrixNotificationId");
		if (matrixNotificationId != null)
			return matrixNotificationId;
		else
			throw new RuntimeException("matrixNotificationId Is not mentioned in the configuration.properties file");
	}

	public String getagencyId() {
		String agencyId = properties.getProperty("agencyId");
		if (agencyId != null)
			return agencyId;
		else
			throw new RuntimeException("agencyId Is not mentioned in the configuration.properties file");
	}

	public String getplaylistId() {
		String playlistId = properties.getProperty("playlistId");
		if (playlistId != null)
			return playlistId;
		else
			throw new RuntimeException("playlistId Is not mentioned in the configuration.properties file");
	}

	public String getbannerId() {
		String bannerId = properties.getProperty("bannerId");
		if (bannerId != null)
			return bannerId;
		else
			throw new RuntimeException("bannerId Is not mentioned in the configuration.properties file");
	}

	public String getfavorId() {
		String favorId = properties.getProperty("favorId");
		if (favorId != null)
			return favorId;
		else
			throw new RuntimeException("favorId Is not mentioned in the configuration.properties file");
	}

	public String getmilestoneId() {
		String milestoneId = properties.getProperty("milestoneId");
		if (milestoneId != null)
			return milestoneId;
		else
			throw new RuntimeException("milestoneId Is not mentioned in the configuration.properties file");
	}

	public String geteventtype() {
		String eventType = properties.getProperty("eventType");
		if (eventType != null)
			return eventType;
		else
			throw new RuntimeException("eventType Is not mentioned in the configuration.properties file");
	}

	public String getfaqId() {
		String faqId = properties.getProperty("faqId");
		if (faqId != null)
			return faqId;
		else
			throw new RuntimeException("faqId Is not mentioned in the configuration.properties file");
	}

	public String getfaqtopicId() {
		String faqtopicId = properties.getProperty("faqtopicId");
		if (faqtopicId != null)
			return faqtopicId;
		else
			throw new RuntimeException("faqtopicId Is not mentioned in the configuration.properties file");
	}

	public String getrolId() {
		String roleId = properties.getProperty("roleId");
		if (roleId != null)
			return roleId;
		else
			throw new RuntimeException("roleId Is not mentioned in the configuration.properties file");
	}

	public String getsponsorId() {
		String sponsorId = properties.getProperty("sponsorId");
		if (sponsorId != null)
			return sponsorId;
		else
			throw new RuntimeException("sponsorId Is not mentioned in the configuration.properties file");
	}

	public String getsurveyType() {
		String surveyType = properties.getProperty("surveyType");
		if (surveyType != null)
			return surveyType;
		else
			throw new RuntimeException("surveyType Is not mentioned in the configuration.properties file");
	}

	public String getlinkId() {
		String linkId = properties.getProperty("linkId");
		if (linkId != null)
			return linkId;
		else
			throw new RuntimeException("linkId Is not mentioned in the configuration.properties file");
	}

	public String gettemplateId() {
		String templateId = properties.getProperty("templateId");
		if (templateId != null)
			return templateId;
		else
			throw new RuntimeException("templateId Is not mentioned in the configuration.properties file");
	}

	public String geteventCreatedDate() {
		String eventCreatedDate = properties.getProperty("eventCreatedDate");
		if (eventCreatedDate != null)
			return eventCreatedDate;
		else
			throw new RuntimeException("eventCreatedDate Is not mentioned in the configuration.properties file");
	}

	public String getcampaignId() {
		String campaignId = properties.getProperty("campaignId");
		if (campaignId != null)
			return campaignId;
		else
			throw new RuntimeException("campaignId Is not mentioned in the configuration.properties file");
	}

	public String getdirectionASC() {
		String directionASC = properties.getProperty("directionASC");
		if (directionASC != null)
			return directionASC;
		else
			throw new RuntimeException("directionASC Is not mentioned in the configuration.properties file");
	}

	public String getevnetTypeUpcomingEvents() {
		String evnetTypeUpcomingEvents = properties.getProperty("evnetTypeUpcomingEvents");
		if (evnetTypeUpcomingEvents != null)
			return evnetTypeUpcomingEvents;
		else
			throw new RuntimeException("evnetTypeUpcomingEvents Is not mentioned in the configuration.properties file");
	}

	public String geteventTypeOpenEvents() {
		String eventTypeOpenEvents = properties.getProperty("eventTypeOpenEvents");
		if (eventTypeOpenEvents != null)
			return eventTypeOpenEvents;
		else
			throw new RuntimeException("eventTypeOpenEvents Is not mentioned in the configuration.properties file");
	}

	public String geteventTypeCurrentEvents() {
		String eventTypeCurrentEvents = properties.getProperty("eventTypeCurrentEvents");
		if (eventTypeCurrentEvents != null)
			return eventTypeCurrentEvents;
		else
			throw new RuntimeException("eventTypeCurrentEvents Is not mentioned in the configuration.properties file");
	}

	public String geteventTypePastEvents() {
		String eventTypePastEvents = properties.getProperty("eventTypePastEvents");
		if (eventTypePastEvents != null)
			return eventTypePastEvents;
		else
			throw new RuntimeException("eventTypePastEvents Is not mentioned in the configuration.properties file");
	}

	public String getExcelSheetPageName2() {
		String ExcelSheetPageName2 = properties.getProperty("ExcelSheetPageName2");
		if (ExcelSheetPageName2 != null)
			return ExcelSheetPageName2;
		else
			throw new RuntimeException("ExcelSheetPageName2 Is not mentioned in the configuration.properties file");

	}

	public String getcommentId() {
		String commentId = properties.getProperty("commentId");
		if (commentId != null)
			return commentId;
		else
			throw new RuntimeException("commentId Is not mentioned in the configuration.properties file");

	}

	public String getupdateCommentbody() {
		String updateCommentbody = properties.getProperty("updateCommentbody");
		if (updateCommentbody != null)
			return updateCommentbody;
		else
			throw new RuntimeException("updateCommentbody Is not mentioned in the configuration.properties file");

	}

	public String getisActive() {
		String isActive = properties.getProperty("isActive");
		if (isActive != null)
			return isActive;
		else
			throw new RuntimeException("isActive Is not mentioned in the configuration.properties file");
	}

	public String getserviceId() {
		String serviceId = properties.getProperty("serviceId");
		if (serviceId != null)
			return serviceId;
		else
			throw new RuntimeException("serviceId Is not mentioned in the configuration.properties file");
	}

	public String getsubscriptionId() {
		String subscriptionId = properties.getProperty("subscriptionId");
		if (subscriptionId != null)
			return subscriptionId;
		else
			throw new RuntimeException("subscriptionId Is not mentioned in the configuration.properties file");
	}

	public String getisSponsorSubscribed() {
		String isSponsorSubscribed = properties.getProperty("isSponsorSubscribed");
		if (isSponsorSubscribed != null)
			return isSponsorSubscribed;
		else
			throw new RuntimeException("isSponsorSubscribed Is not mentioned in the configuration.properties file");
	}

	public String getapplicationId() {
		String applicationId = properties.getProperty("applicationId");
		if (applicationId != null)
			return applicationId;
		else
			throw new RuntimeException("applicationId Is not mentioned in the configuration.properties file");
	}

	public String getputBenefitId() {
		String putBenefitId = properties.getProperty("putBenefitId");
		if (putBenefitId != null)
			return putBenefitId;
		else
			throw new RuntimeException("putBenefitId Is not mentioned in the configuration.properties file");
	}

	public String getdescription() {
		String description = properties.getProperty("description");
		if (description != null)
			return description;
		else
			throw new RuntimeException("description Is not mentioned in the configuration.properties file");
	}

	public String getsegmentJobId() {
		String segmentJobId = properties.getProperty("segmentJobId");
		if (segmentJobId != null)
			return segmentJobId;
		else
			throw new RuntimeException("segmentJobId Is not mentioned in the configuration.properties file");
	}

	public String getgameoptionId() {
		String gameoptionId = properties.getProperty("gameoptionId");
		if (gameoptionId != null)
			return gameoptionId;
		else
			throw new RuntimeException("gameoptionId Is not mentioned in the configuration.properties file");
	}

	public String getAuthorization() {
		String Authorization = properties.getProperty("Authorization");
		if (Authorization != null)
			return Authorization;
		else
			throw new RuntimeException("Authorization Is not mentioned in the configuration.properties file");
	}

	public String getrewardAllocationstatus() {
		String rewardAllocationstatus = properties.getProperty("rewardAllocationstatus");
		if (rewardAllocationstatus != null)
			return rewardAllocationstatus;
		else
			throw new RuntimeException("rewardAllocationstatus Is not mentioned in the configuration.properties file");
	}

	public String getrewardAllocationItemId() {
		String rewardAllocationItemId = properties.getProperty("rewardAllocationItemId");
		if (rewardAllocationItemId != null)
			return rewardAllocationItemId;
		else
			throw new RuntimeException("rewardAllocationItemId Is not mentioned in the configuration.properties file");
	}

	public String getdeliveryItemId() {
		String deliveryItemId = properties.getProperty("deliveryItemId");
		if (deliveryItemId != null)
			return deliveryItemId;
		else
			throw new RuntimeException("deliveryItemId Is not mentioned in the configuration.properties file");
	}

	public String getrewardItemId() {
		String rewardItemId = properties.getProperty("rewardItemId");
		if (rewardItemId != null)
			return rewardItemId;
		else
			throw new RuntimeException("rewardItemId Is not mentioned in the configuration.properties file");
	}

	public String getputNotificationId() {
		String putNotificationId = properties.getProperty("putNotificationId");
		if (putNotificationId != null)
			return putNotificationId;
		else
			throw new RuntimeException("putNotificationId Is not mentioned in the configuration.properties file");
	}

	public String getpublishStatus() {
		String publishStatus = properties.getProperty("publishStatus");
		if (publishStatus != null)
			return publishStatus;
		else
			throw new RuntimeException("publishStatus Is not mentioned in the configuration.properties file");
	}

	public String getupdateTemplateId() {
		String updateTemplateId = properties.getProperty("updateTemplateId");
		if (updateTemplateId != null)
			return updateTemplateId;
		else
			throw new RuntimeException("updateTemplateId Is not mentioned in the configuration.properties file");
	}

	public String getisSuppressed() {
		String isSuppressed = properties.getProperty("isSuppressed");
		if (isSuppressed != null)
			return isSuppressed;
		else
			throw new RuntimeException("isSuppressed Is not mentioned in the configuration.properties file");
	}

	public String getputAssetId() {
		String putAssetId = properties.getProperty("putAssetId");
		if (putAssetId != null)
			return putAssetId;
		else
			throw new RuntimeException("putAssetId Is not mentioned in the configuration.properties file");
	}

	public String getupdateEventMileStoneId() {
		String updateEventMileStoneId = properties.getProperty("updateEventMileStoneId");
		if (updateEventMileStoneId != null)
			return updateEventMileStoneId;
		else
			throw new RuntimeException("updateEventMileStoneId Is not mentioned in the configuration.properties file");
	}

	public String gettargetId() {
		String targetId = properties.getProperty("targetId");
		if (targetId != null)
			return targetId;
		else
			throw new RuntimeException("targetId Is not mentioned in the configuration.properties file");
	}
	public String getPutFAQID() {
		String PutFAQID = properties.getProperty("PutFAQID");
		if (PutFAQID != null)
			return PutFAQID;
		else
			throw new RuntimeException("PutFAQID Is not mentioned in the configuration.properties file");
	}
	public String getgoalId() {
		String goalId = properties.getProperty("goalId");
		if (goalId != null)
			return goalId;
		else
			throw new RuntimeException("goalId Is not mentioned in the configuration.properties file");
	}

}
