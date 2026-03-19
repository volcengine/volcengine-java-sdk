package com.volcengine.auth;

import com.volcengine.ApiException;

/**
 * Manual test for EcsRoleCredentialProvider maxRetries defense.
 * Run: javac + java, or via IDE.
 */
public class EcsRoleCredentialProviderTest {

    public static void main(String[] args) {
        testMaxRetriesZeroDoesNotCrash();
        testMaxRetriesNegativeDoesNotCrash();
        System.out.println("All EcsRoleCredentialProvider tests passed.");
    }

    static void testMaxRetriesZeroDoesNotCrash() {
        // maxRetries=0 should be normalized to 1, no NPE
        EcsRoleCredentialProvider provider = new EcsRoleCredentialProvider(
                "test-role", 100, 100, 0, 100, 300);
        try {
            provider.retrieve();
            throw new AssertionError("Expected ApiException due to IMDS unreachable");
        } catch (ApiException e) {
            assert e.getMessage().contains("EcsRoleCredentialProvider") :
                    "Error should mention provider name: " + e.getMessage();
            System.out.println("PASS: testMaxRetriesZeroDoesNotCrash");
        }
    }

    static void testMaxRetriesNegativeDoesNotCrash() {
        EcsRoleCredentialProvider provider = new EcsRoleCredentialProvider(
                "test-role", 100, 100, -5, 100, 300);
        try {
            provider.retrieve();
            throw new AssertionError("Expected ApiException due to IMDS unreachable");
        } catch (ApiException e) {
            assert e.getMessage().contains("EcsRoleCredentialProvider") :
                    "Error should mention provider name: " + e.getMessage();
            System.out.println("PASS: testMaxRetriesNegativeDoesNotCrash");
        }
    }
}
